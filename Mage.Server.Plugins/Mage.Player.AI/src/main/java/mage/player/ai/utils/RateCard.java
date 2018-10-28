package mage.player.ai.utils;

import mage.abilities.Ability;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.DamageTargetEffect;
import mage.cards.Card;
import mage.constants.ColoredManaSymbol;
import mage.constants.Outcome;
import mage.target.Target;
import mage.target.common.TargetCreaturePermanent;
import org.apache.log4j.Logger;

import java.io.InputStream;
import java.util.*;
import mage.abilities.Mode;
import mage.abilities.effects.common.DamageWithPowerTargetEffect;
import mage.abilities.effects.common.DestroyTargetEffect;
import mage.abilities.effects.common.ExileTargetEffect;
import mage.abilities.effects.common.ExileUntilSourceLeavesEffect;
import mage.abilities.effects.common.FightTargetsEffect;
import mage.abilities.effects.common.continuous.BoostEnchantedEffect;
import mage.abilities.effects.common.continuous.BoostTargetEffect;
import mage.constants.Rarity;
import mage.constants.SubType;
import mage.target.TargetPermanent;
import mage.target.common.TargetAttackingCreature;
import mage.target.common.TargetAttackingOrBlockingCreature;
import mage.target.common.TargetPlayerOrPlaneswalker;

/**
 * Class responsible for reading ratings from resources and rating given cards.
 * Based on card relative ratings from resources and card parameters.
 *
 * @author nantuko
 */
public final class RateCard {

    private static Map<String, Integer> ratings;
    private static final Map<String, Integer> rated = new HashMap<>();
    private static Integer min = Integer.MAX_VALUE, max = 0;

    /**
     * Rating that is given for new cards.
     * Ratings are in [1,10] range, so setting it high will make new cards appear more often.
     */
    private static final int DEFAULT_NOT_RATED_CARD_RATING = 4;

    private static final Logger log = Logger.getLogger(RateCard.class);

    /**
     * Hide constructor.
     */
    private RateCard() {
    }

    /**
     * Get absolute score of the card.
     * Depends on type, manacost, rating.
     * If allowedColors is null then the rating is retrieved from the cache
     *
     * @param card
     * @param allowedColors
     * @return
     */
    public static int rateCard(Card card, List<ColoredManaSymbol> allowedColors) {
        if (allowedColors == null && rated.containsKey(card.getName())) {
            int rate = rated.get(card.getName());
            return rate;
        }
        int type;
        if (card.isPlaneswalker()) {
            type = 15;
        } else if (card.isCreature()) {
            type = 10;
        } else if (card.getSubtype(null).contains(SubType.EQUIPMENT)) {
            type = 8;
        } else if (card.getSubtype(null).contains(SubType.AURA)) {
            type = 5;
        } else if (card.isInstant()) {
            type = 7;
        } else {
            type = 6;
        }
        int score = 10 * getCardRating(card) + 2 * type + getManaCostScore(card, allowedColors)
                + 40 * isRemoval(card) + getRarityScore(card);
        if (allowedColors == null)
            rated.put(card.getName(), score);
        return score;
    }

    private static int isRemoval(Card card) {
        if (card.isEnchantment() || card.isInstant() || card.isSorcery()) {

            for (Ability ability : card.getAbilities()) {
                for (Effect effect : ability.getEffects()) { 
                    if (isEffectRemoval(card, ability, effect) == 1){
                        return 1;
                    }
                }
                for (Mode mode: ability.getModes().values() ){
                    for (Effect effect: mode.getEffects()){
                        if (isEffectRemoval(card, ability, effect) == 1){
                            return 1;
                        }
                    }
                }
            }
           
        }
        return 0;
    }
    
    private static int isEffectRemoval(Card card, Ability ability, Effect effect){
        if (effect.getOutcome() == Outcome.Removal) {
            log.debug("Found removal: " + card.getName());
            return 1;
        }
        //static List<Effect> removalEffects =[BoostTargetEffect,BoostEnchantedEffect]
        if (effect instanceof BoostTargetEffect || effect instanceof BoostEnchantedEffect){
            String text = effect.getText(null);
            if (text.contains("/-")){
                // toughness reducer, aka removal
                return 1;
            }
        }
        if (effect instanceof FightTargetsEffect || effect instanceof DamageWithPowerTargetEffect){
            return 1;
        }
        if (effect.getOutcome() == Outcome.Damage || effect instanceof DamageTargetEffect) {
            for (Target target : ability.getTargets()) {
                if (!(target instanceof TargetPlayerOrPlaneswalker)){
                    log.debug("Found damage dealer: " + card.getName());
                    return 1;
                }
            }
        }
        if (effect.getOutcome() == Outcome.DestroyPermanent || 
                effect instanceof DestroyTargetEffect || 
                effect instanceof ExileTargetEffect || 
                effect instanceof ExileUntilSourceLeavesEffect) {
            for (Target target : ability.getTargets()) {
                if (target instanceof TargetCreaturePermanent || 
                        target instanceof TargetAttackingCreature ||
                        target instanceof TargetAttackingOrBlockingCreature ||
                        target instanceof TargetPermanent) {
                    log.debug("Found destroyer/exiler: " + card.getName());
                    return 1;
                }
            }
        }
        
        return 0;
    }

    /**
     * Return rating of the card.
     *
     * @param card Card to rate.
     * @return Rating number from [1;10].
     */
    public static int getCardRating(Card card) {
        if (ratings == null) {
            readRatings();
        }
        if (ratings.containsKey(card.getName())) {
            int r = ratings.get(card.getName());
            // normalize to [1..10]
            float f = 10.0f * (r - min) / (max - min);
            return (int) Math.round(f);
        }
        return DEFAULT_NOT_RATED_CARD_RATING;
    }

    /**
     * Reads ratings from resources.
     */
    private synchronized static void readRatings() {
        if (ratings == null) {
            ratings = new HashMap<>();
            readFromFile("/m13.csv");
        }
    }
    
    private static void readFromFile(String path) {
        try {
            InputStream is = RateCard.class.getResourceAsStream(path);
            Scanner scanner = new Scanner(is);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] s = line.split(":");
                if (s.length == 2) {
                    Integer rating = Integer.parseInt(s[1].trim());
                    String name = s[0].trim();
                    if (rating > max) {
                        max = rating;
                    }
                    if (rating < min) {
                        min = rating;
                    }
                    ratings.put(name, rating);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            ratings.clear(); // no rating available on exception
        }
    }

    private static final int SINGLE_PENALTY[] = {0, 1, 1, 3, 6, 9};
    private static final int MULTICOLOR_BONUS = 15;

    /**
     * Get manacost score.
     * Depends on chosen colors. Returns negative score for those cards that doesn't fit allowed colors.
     * If allowed colors are not chosen, then score based on converted cost is returned with penalty for heavy colored cards.
     * gives bonus to multicolor cards that fit within allowed colors and if allowed colors is <5
     *
     *
     * @param card
     * @param allowedColors Can be null.
     * @return
     */
    private static int getManaCostScore(Card card, List<ColoredManaSymbol> allowedColors) {
        int converted = card.getManaCost().convertedManaCost();
        if (allowedColors == null) {
            int colorPenalty = 0;
            for (String symbol : card.getManaCost().getSymbols()) {
                if (isColoredMana(symbol)) {
                     colorPenalty++;
                }
            }
            return 2 * (converted - colorPenalty + 1);
        }
        final Map<String, Integer> singleCount = new HashMap<>();
        int maxSingleCount = 0;
        for (String symbol : card.getManaCost().getSymbols()) {
            int count = 0;
            symbol = symbol.replace("{", "").replace("}", "");
            if (isColoredMana(symbol)) {
                for (ColoredManaSymbol allowed : allowedColors) {
                    if (allowed.toString().equals(symbol)) {
                        count++;
                    }
                }
                if (count == 0) {
                    return -100;
                }
                Integer typeCount = singleCount.get(symbol);
                if (typeCount == null) {
                    typeCount = new Integer(0);
                }
                typeCount += 1;
                singleCount.put(symbol, typeCount);
                maxSingleCount = Math.max(maxSingleCount, typeCount);
            }
        }
        if (maxSingleCount > 5)
            maxSingleCount = 5;

        int rate = 2 * converted + 3 * (10 - SINGLE_PENALTY[maxSingleCount]);
        if( singleCount.size() > 1 && singleCount.size() < 5){
            rate += MULTICOLOR_BONUS;
        }
        return rate;
    }

    /**
     * Get rarity score.
     * nowadays, cards that are more rare are more powerful, lets
     * trust that and play the shiny cards.
     *
     * @param card
     * @return integer rating value
     */
    private static int getRarityScore(Card card) {
        Rarity r = card.getRarity();
        if (Rarity.MYTHIC == r){
            return 60;
        }else if (Rarity.RARE == r){
            return 40;
        }else if (Rarity.UNCOMMON == r){
            return 20;
        }else{
            return 0;
        }
    }
    /**
     * Determines whether mana symbol is color.
     *
      * @param symbol
     * @return
     */
    public static boolean isColoredMana(String symbol) {
        String s = symbol;
        if (s.length() > 1) {
            s = s.replace("{","").replace("}","");
        }
        if (s.length() > 1) {
            return false;
        }
        return s.equals("W") || s.equals("G") || s.equals("U") || s.equals("B") || s.equals("R");
    }

    /**
     * Return number of color mana symbols in manacost.
     * @param card
     * @return
     */
    public static int getColorManaCount(Card card) {
        int count = 0;
        for (String symbol : card.getManaCost().getSymbols()) {
            if (isColoredMana(symbol)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Return number of different color mana symbols in manacost.
     * @param card
     * @return
     */
    public static int getDifferentColorManaCount(Card card) {
        Set<String> symbols = new HashSet<>();
        for (String symbol : card.getManaCost().getSymbols()) {
            if (isColoredMana(symbol)) {
                symbols.add(symbol);
            }
        }
        return symbols.size();
    }
}
