package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 * @author TheElk801
 */
public final class CommanderLegendsBattleForBaldursGate extends ExpansionSet {

    private static final CommanderLegendsBattleForBaldursGate instance = new CommanderLegendsBattleForBaldursGate();

    public static CommanderLegendsBattleForBaldursGate getInstance() {
        return instance;
    }

    private CommanderLegendsBattleForBaldursGate() {
        super("Commander Legends: Battle for Baldur's Gate", "CLB", ExpansionSet.buildDate(2022, 6, 10), SetType.SUPPLEMENTAL);
        this.blockName = "Commander Legends";
        this.hasBasicLands = true;
        this.hasBoosters = false; // temporary

        cards.add(new SetCardInfo("Aarakocra Sneak", 54, Rarity.COMMON, mage.cards.a.AarakocraSneak.class));
        cards.add(new SetCardInfo("Acolyte of Bahamut", 212, Rarity.UNCOMMON, mage.cards.a.AcolyteOfBahamut.class));
        cards.add(new SetCardInfo("Agent of the Iron Throne", 107, Rarity.UNCOMMON, mage.cards.a.AgentOfTheIronThrone.class));
        cards.add(new SetCardInfo("Agent of the Shadow Thieves", 108, Rarity.UNCOMMON, mage.cards.a.AgentOfTheShadowThieves.class));
        cards.add(new SetCardInfo("Alora, Merry Thief", 55, Rarity.UNCOMMON, mage.cards.a.AloraMerryThief.class));
        cards.add(new SetCardInfo("Altar of Bhaal", 109, Rarity.RARE, mage.cards.a.AltarOfBhaal.class));
        cards.add(new SetCardInfo("Amber Gristle O'Maul", 159, Rarity.UNCOMMON, mage.cards.a.AmberGristleOMaul.class));
        cards.add(new SetCardInfo("Ambition's Cost", 110, Rarity.UNCOMMON, mage.cards.a.AmbitionsCost.class));
        cards.add(new SetCardInfo("Amethyst Dragon", 160, Rarity.UNCOMMON, mage.cards.a.AmethystDragon.class));
        cards.add(new SetCardInfo("Ancient Brass Dragon", 111, Rarity.MYTHIC, mage.cards.a.AncientBrassDragon.class));
        cards.add(new SetCardInfo("Ancient Bronze Dragon", 214, Rarity.MYTHIC, mage.cards.a.AncientBronzeDragon.class));
        cards.add(new SetCardInfo("Ancient Copper Dragon", 161, Rarity.MYTHIC, mage.cards.a.AncientCopperDragon.class));
        cards.add(new SetCardInfo("Ancient Gold Dragon", 3, Rarity.MYTHIC, mage.cards.a.AncientGoldDragon.class));
        cards.add(new SetCardInfo("Ancient Silver Dragon", 56, Rarity.MYTHIC, mage.cards.a.AncientSilverDragon.class));
        cards.add(new SetCardInfo("Arcane Encyclopedia", 297, Rarity.UNCOMMON, mage.cards.a.ArcaneEncyclopedia.class));
        cards.add(new SetCardInfo("Arcane Signet", 298, Rarity.UNCOMMON, mage.cards.a.ArcaneSignet.class));
        cards.add(new SetCardInfo("Archivist of Oghma", 4, Rarity.RARE, mage.cards.a.ArchivistOfOghma.class));
        cards.add(new SetCardInfo("Armor of Shadows", 112, Rarity.COMMON, mage.cards.a.ArmorOfShadows.class));
        cards.add(new SetCardInfo("Arms of Hadar", 113, Rarity.COMMON, mage.cards.a.ArmsOfHadar.class));
        cards.add(new SetCardInfo("Artificer Class", 663, Rarity.RARE, mage.cards.a.ArtificerClass.class));
        cards.add(new SetCardInfo("Ascend from Avernus", 5, Rarity.RARE, mage.cards.a.AscendFromAvernus.class));
        cards.add(new SetCardInfo("Astarion's Thirst", 114, Rarity.RARE, mage.cards.a.AstarionsThirst.class));
        cards.add(new SetCardInfo("Astarion, the Decadent", 265, Rarity.RARE, mage.cards.a.AstarionTheDecadent.class));
        cards.add(new SetCardInfo("Astral Confrontation", 6, Rarity.COMMON, mage.cards.a.AstralConfrontation.class));
        cards.add(new SetCardInfo("Astral Dragon", 664, Rarity.RARE, mage.cards.a.AstralDragon.class));
        cards.add(new SetCardInfo("Atrocious Experiment", 115, Rarity.COMMON, mage.cards.a.AtrociousExperiment.class));
        cards.add(new SetCardInfo("Avenging Hunter", 215, Rarity.COMMON, mage.cards.a.AvengingHunter.class));
        cards.add(new SetCardInfo("Baba Lysaga, Night Witch", 266, Rarity.RARE, mage.cards.b.BabaLysagaNightWitch.class));
        cards.add(new SetCardInfo("Bag of Holding", 299, Rarity.UNCOMMON, mage.cards.b.BagOfHolding.class));
        cards.add(new SetCardInfo("Baldur's Gate", 345, Rarity.RARE, mage.cards.b.BaldursGate.class));
        cards.add(new SetCardInfo("Band Together", 216, Rarity.COMMON, mage.cards.b.BandTogether.class));
        cards.add(new SetCardInfo("Bane's Contingency", 57, Rarity.UNCOMMON, mage.cards.b.BanesContingency.class));
        cards.add(new SetCardInfo("Bane's Invoker", 7, Rarity.COMMON, mage.cards.b.BanesInvoker.class));
        cards.add(new SetCardInfo("Basilisk Collar", 300, Rarity.RARE, mage.cards.b.BasiliskCollar.class));
        cards.add(new SetCardInfo("Basilisk Gate", 346, Rarity.COMMON, mage.cards.b.BasiliskGate.class));
        cards.add(new SetCardInfo("Battle Angels of Tyr", 9, Rarity.MYTHIC, mage.cards.b.BattleAngelsOfTyr.class));
        cards.add(new SetCardInfo("Bhaal's Invoker", 163, Rarity.COMMON, mage.cards.b.BhaalsInvoker.class));
        cards.add(new SetCardInfo("Bhaal, Lord of Murder", 268, Rarity.RARE, mage.cards.b.BhaalLordOfMurder.class));
        cards.add(new SetCardInfo("Black Dragon Gate", 347, Rarity.COMMON, mage.cards.b.BlackDragonGate.class));
        cards.add(new SetCardInfo("Blade of Selves", 301, Rarity.RARE, mage.cards.b.BladeOfSelves.class));
        cards.add(new SetCardInfo("Blessed Hippogriff", 11, Rarity.COMMON, mage.cards.b.BlessedHippogriff.class));
        cards.add(new SetCardInfo("Blood Money", 116, Rarity.MYTHIC, mage.cards.b.BloodMoney.class));
        cards.add(new SetCardInfo("Bloodboil Sorcerer", 164, Rarity.UNCOMMON, mage.cards.b.BloodboilSorcerer.class));
        cards.add(new SetCardInfo("Blur", 58, Rarity.COMMON, mage.cards.b.Blur.class));
        cards.add(new SetCardInfo("Bonecaller Cleric", 117, Rarity.UNCOMMON, mage.cards.b.BonecallerCleric.class));
        cards.add(new SetCardInfo("Bothersome Quasit", 674, Rarity.RARE, mage.cards.b.BothersomeQuasit.class));
        cards.add(new SetCardInfo("Bountiful Promenade", 348, Rarity.RARE, mage.cards.b.BountifulPromenade.class));
        cards.add(new SetCardInfo("Bramble Sovereign", 218, Rarity.MYTHIC, mage.cards.b.BrambleSovereign.class));
        cards.add(new SetCardInfo("Breath Weapon", 165, Rarity.COMMON, mage.cards.b.BreathWeapon.class));
        cards.add(new SetCardInfo("Bronze Walrus", 302, Rarity.COMMON, mage.cards.b.BronzeWalrus.class));
        cards.add(new SetCardInfo("Burnished Hart", 303, Rarity.UNCOMMON, mage.cards.b.BurnishedHart.class));
        cards.add(new SetCardInfo("Cadira, Caller of the Small", 269, Rarity.UNCOMMON, mage.cards.c.CadiraCallerOfTheSmall.class));
        cards.add(new SetCardInfo("Campfire", 304, Rarity.UNCOMMON, mage.cards.c.Campfire.class));
        cards.add(new SetCardInfo("Candlekeep Sage", 60, Rarity.COMMON, mage.cards.c.CandlekeepSage.class));
        cards.add(new SetCardInfo("Carefree Swinemaster", 219, Rarity.COMMON, mage.cards.c.CarefreeSwinemaster.class));
        cards.add(new SetCardInfo("Carnelian Orb of Dragonkind", 166, Rarity.COMMON, mage.cards.c.CarnelianOrbOfDragonkind.class));
        cards.add(new SetCardInfo("Cast Down", 119, Rarity.UNCOMMON, mage.cards.c.CastDown.class));
        cards.add(new SetCardInfo("Chain Devil", 120, Rarity.COMMON, mage.cards.c.ChainDevil.class));
        cards.add(new SetCardInfo("Charcoal Diamond", 305, Rarity.COMMON, mage.cards.c.CharcoalDiamond.class));
        cards.add(new SetCardInfo("Chardalyn Dragon", 306, Rarity.COMMON, mage.cards.c.ChardalynDragon.class));
        cards.add(new SetCardInfo("Circle of the Land Druid", 220, Rarity.COMMON, mage.cards.c.CircleOfTheLandDruid.class));
        cards.add(new SetCardInfo("Citadel Gate", 349, Rarity.COMMON, mage.cards.c.CitadelGate.class));
        cards.add(new SetCardInfo("Clan Crafter", 651, Rarity.MYTHIC, mage.cards.c.ClanCrafter.class));
        cards.add(new SetCardInfo("Cliffgate", 350, Rarity.COMMON, mage.cards.c.Cliffgate.class));
        cards.add(new SetCardInfo("Cloak of the Bat", 307, Rarity.COMMON, mage.cards.c.CloakOfTheBat.class));
        cards.add(new SetCardInfo("Cloakwood Hermit", 221, Rarity.UNCOMMON, mage.cards.c.CloakwoodHermit.class));
        cards.add(new SetCardInfo("Cloakwood Swarmkeeper", 222, Rarity.COMMON, mage.cards.c.CloakwoodSwarmkeeper.class));
        cards.add(new SetCardInfo("Clockwork Fox", 308, Rarity.COMMON, mage.cards.c.ClockworkFox.class));
        cards.add(new SetCardInfo("Cloudkill", 121, Rarity.UNCOMMON, mage.cards.c.Cloudkill.class));
        cards.add(new SetCardInfo("Colossal Badger", 223, Rarity.COMMON, mage.cards.c.ColossalBadger.class));
        cards.add(new SetCardInfo("Command Tower", 351, Rarity.COMMON, mage.cards.c.CommandTower.class));
        cards.add(new SetCardInfo("Cone of Cold", 61, Rarity.UNCOMMON, mage.cards.c.ConeOfCold.class));
        cards.add(new SetCardInfo("Consuming Aberration", 640, Rarity.RARE, mage.cards.c.ConsumingAberration.class));
        cards.add(new SetCardInfo("Contact Other Plane", 62, Rarity.COMMON, mage.cards.c.ContactOtherPlane.class));
        cards.add(new SetCardInfo("Contraband Livestock", 12, Rarity.UNCOMMON, mage.cards.c.ContrabandLivestock.class));
        cards.add(new SetCardInfo("Coronation of Chaos", 168, Rarity.COMMON, mage.cards.c.CoronationOfChaos.class));
        cards.add(new SetCardInfo("Criminal Past", 122, Rarity.UNCOMMON, mage.cards.c.CriminalPast.class));
        cards.add(new SetCardInfo("Crystal Dragon", 13, Rarity.UNCOMMON, mage.cards.c.CrystalDragon.class));
        cards.add(new SetCardInfo("Cultist of the Absolute", 123, Rarity.RARE, mage.cards.c.CultistOfTheAbsolute.class));
        cards.add(new SetCardInfo("Cut a Deal", 14, Rarity.UNCOMMON, mage.cards.c.CutADeal.class));
        cards.add(new SetCardInfo("Dawnbringer Cleric", 15, Rarity.COMMON, mage.cards.d.DawnbringerCleric.class));
        cards.add(new SetCardInfo("Deadly Dispute", 124, Rarity.COMMON, mage.cards.d.DeadlyDispute.class));
        cards.add(new SetCardInfo("Decanter of Endless Water", 309, Rarity.COMMON, mage.cards.d.DecanterOfEndlessWater.class));
        cards.add(new SetCardInfo("Displacer Kitten", 63, Rarity.RARE, mage.cards.d.DisplacerKitten.class));
        cards.add(new SetCardInfo("Draconic Lore", 64, Rarity.COMMON, mage.cards.d.DraconicLore.class));
        cards.add(new SetCardInfo("Draconic Muralists", 224, Rarity.UNCOMMON, mage.cards.d.DraconicMuralists.class));
        cards.add(new SetCardInfo("Dragonborn Looter", 65, Rarity.COMMON, mage.cards.d.DragonbornLooter.class));
        cards.add(new SetCardInfo("Dread Linnorm", 225, Rarity.COMMON, mage.cards.d.DreadLinnorm.class));
        cards.add(new SetCardInfo("Dream Fracture", 66, Rarity.COMMON, mage.cards.d.DreamFracture.class));
        cards.add(new SetCardInfo("Drillworks Mole", 311, Rarity.UNCOMMON, mage.cards.d.DrillworksMole.class));
        cards.add(new SetCardInfo("Druidic Ritual", 227, Rarity.COMMON, mage.cards.d.DruidicRitual.class));
        cards.add(new SetCardInfo("Duke Ulder Ravengard", 272, Rarity.RARE, mage.cards.d.DukeUlderRavengard.class));
        cards.add(new SetCardInfo("Dungeon Delver", 67, Rarity.UNCOMMON, mage.cards.d.DungeonDelver.class));
        cards.add(new SetCardInfo("Dungeoneer's Pack", 312, Rarity.UNCOMMON, mage.cards.d.DungeoneersPack.class));
        cards.add(new SetCardInfo("Earth Tremor", 171, Rarity.COMMON, mage.cards.e.EarthTremor.class));
        cards.add(new SetCardInfo("Earthquake Dragon", 228, Rarity.RARE, mage.cards.e.EarthquakeDragon.class));
        cards.add(new SetCardInfo("Elder Brain", 125, Rarity.RARE, mage.cards.e.ElderBrain.class));
        cards.add(new SetCardInfo("Eldritch Pact", 126, Rarity.RARE, mage.cards.e.EldritchPact.class));
        cards.add(new SetCardInfo("Ellyn Harbreeze, Busybody", 16, Rarity.UNCOMMON, mage.cards.e.EllynHarbreezeBusybody.class));
        cards.add(new SetCardInfo("Elminster", 274, Rarity.MYTHIC, mage.cards.e.Elminster.class));
        cards.add(new SetCardInfo("Elminster's Simulacrum", 68, Rarity.MYTHIC, mage.cards.e.ElminstersSimulacrum.class));
        cards.add(new SetCardInfo("Elturel Survivors", 172, Rarity.RARE, mage.cards.e.ElturelSurvivors.class));
        cards.add(new SetCardInfo("Emerald Dragon", 229, Rarity.UNCOMMON, mage.cards.e.EmeraldDragon.class));
        cards.add(new SetCardInfo("Erinis, Gloom Stalker", 230, Rarity.UNCOMMON, mage.cards.e.ErinisGloomStalker.class));
        cards.add(new SetCardInfo("Ettercap", 231, Rarity.COMMON, mage.cards.e.Ettercap.class));
        cards.add(new SetCardInfo("Evolving Wilds", 352, Rarity.COMMON, mage.cards.e.EvolvingWilds.class));
        cards.add(new SetCardInfo("Explore the Underdark", 232, Rarity.UNCOMMON, mage.cards.e.ExploreTheUnderdark.class));
        cards.add(new SetCardInfo("Faceless One", 1, Rarity.SPECIAL, mage.cards.f.FacelessOne.class));
        cards.add(new SetCardInfo("Fang Dragon", 173, Rarity.COMMON, mage.cards.f.FangDragon.class));
        cards.add(new SetCardInfo("Far Traveler", 17, Rarity.UNCOMMON, mage.cards.f.FarTraveler.class));
        cards.add(new SetCardInfo("Feywild Caretaker", 69, Rarity.UNCOMMON, mage.cards.f.FeywildCaretaker.class));
        cards.add(new SetCardInfo("Firbolg Flutist", 174, Rarity.RARE, mage.cards.f.FirbolgFlutist.class));
        cards.add(new SetCardInfo("Fire Diamond", 313, Rarity.COMMON, mage.cards.f.FireDiamond.class));
        cards.add(new SetCardInfo("Fireball", 175, Rarity.UNCOMMON, mage.cards.f.Fireball.class));
        cards.add(new SetCardInfo("Flaming Fist Officer", 19, Rarity.COMMON, mage.cards.f.FlamingFistOfficer.class));
        cards.add(new SetCardInfo("Flaming Fist", 18, Rarity.COMMON, mage.cards.f.FlamingFist.class));
        cards.add(new SetCardInfo("Folk Hero", 650, Rarity.MYTHIC, mage.cards.f.FolkHero.class));
        cards.add(new SetCardInfo("Font of Magic", 71, Rarity.MYTHIC, mage.cards.f.FontOfMagic.class));
        cards.add(new SetCardInfo("Forest", 467, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ganax, Astral Hunter", 176, Rarity.UNCOMMON, mage.cards.g.GanaxAstralHunter.class));
        cards.add(new SetCardInfo("Gate Colossus", 315, Rarity.UNCOMMON, mage.cards.g.GateColossus.class));
        cards.add(new SetCardInfo("Genasi Enforcers", 177, Rarity.COMMON, mage.cards.g.GenasiEnforcers.class));
        cards.add(new SetCardInfo("Geode Golem", 316, Rarity.UNCOMMON, mage.cards.g.GeodeGolem.class));
        cards.add(new SetCardInfo("Ghastly Death Tyrant", 127, Rarity.COMMON, mage.cards.g.GhastlyDeathTyrant.class));
        cards.add(new SetCardInfo("Ghost Lantern", 128, Rarity.UNCOMMON, mage.cards.g.GhostLantern.class));
        cards.add(new SetCardInfo("Giant Ankheg", 233, Rarity.UNCOMMON, mage.cards.g.GiantAnkheg.class));
        cards.add(new SetCardInfo("Githzerai Monk", 20, Rarity.UNCOMMON, mage.cards.g.GithzeraiMonk.class));
        cards.add(new SetCardInfo("Goggles of Night", 74, Rarity.COMMON, mage.cards.g.GogglesOfNight.class));
        cards.add(new SetCardInfo("Goliath Paladin", 21, Rarity.COMMON, mage.cards.g.GoliathPaladin.class));
        cards.add(new SetCardInfo("Gorion, Wise Mentor", 276, Rarity.RARE, mage.cards.g.GorionWiseMentor.class));
        cards.add(new SetCardInfo("Gray Harbor Merfolk", 75, Rarity.COMMON, mage.cards.g.GrayHarborMerfolk.class));
        cards.add(new SetCardInfo("Gray Slaad", 129, Rarity.COMMON, mage.cards.g.GraySlaad.class));
        cards.add(new SetCardInfo("Greatsword of Tyr", 22, Rarity.COMMON, mage.cards.g.GreatswordOfTyr.class));
        cards.add(new SetCardInfo("Guardian Naga", 23, Rarity.COMMON, mage.cards.g.GuardianNaga.class));
        cards.add(new SetCardInfo("Guiding Bolt", 24, Rarity.COMMON, mage.cards.g.GuidingBolt.class));
        cards.add(new SetCardInfo("Guild Artisan", 179, Rarity.UNCOMMON, mage.cards.g.GuildArtisan.class));
        cards.add(new SetCardInfo("Guildsworn Prowler", 130, Rarity.COMMON, mage.cards.g.GuildswornProwler.class));
        cards.add(new SetCardInfo("Guiltfeeder", 756, Rarity.RARE, mage.cards.g.Guiltfeeder.class));
        cards.add(new SetCardInfo("Gut, True Soul Zealot", 180, Rarity.UNCOMMON, mage.cards.g.GutTrueSoulZealot.class));
        cards.add(new SetCardInfo("Halsin, Emerald Archdruid", 234, Rarity.UNCOMMON, mage.cards.h.HalsinEmeraldArchdruid.class));
        cards.add(new SetCardInfo("Hammers of Moradin", 25, Rarity.UNCOMMON, mage.cards.h.HammersOfMoradin.class));
        cards.add(new SetCardInfo("Hardy Outlander", 235, Rarity.UNCOMMON, mage.cards.h.HardyOutlander.class));
        cards.add(new SetCardInfo("Heap Gate", 354, Rarity.COMMON, mage.cards.h.HeapGate.class));
        cards.add(new SetCardInfo("Hoarding Ogre", 181, Rarity.COMMON, mage.cards.h.HoardingOgre.class));
        cards.add(new SetCardInfo("Horn of Valhalla", 26, Rarity.RARE, mage.cards.h.HornOfValhalla.class));
        cards.add(new SetCardInfo("Icewind Stalwart", 27, Rarity.COMMON, mage.cards.i.IcewindStalwart.class));
        cards.add(new SetCardInfo("Imoen, Mystic Trickster", 77, Rarity.UNCOMMON, mage.cards.i.ImoenMysticTrickster.class));
        cards.add(new SetCardInfo("Inspired Tinkering", 183, Rarity.UNCOMMON, mage.cards.i.InspiredTinkering.class));
        cards.add(new SetCardInfo("Inspiring Leader", 28, Rarity.UNCOMMON, mage.cards.i.InspiringLeader.class));
        cards.add(new SetCardInfo("Insufferable Balladeer", 184, Rarity.COMMON, mage.cards.i.InsufferableBalladeer.class));
        cards.add(new SetCardInfo("Irenicus's Vile Duplication", 78, Rarity.UNCOMMON, mage.cards.i.IrenicussVileDuplication.class));
        cards.add(new SetCardInfo("Iron Mastiff", 317, Rarity.UNCOMMON, mage.cards.i.IronMastiff.class));
        cards.add(new SetCardInfo("Island", 455, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Jaheira's Respite", 238, Rarity.RARE, mage.cards.j.JaheirasRespite.class));
        cards.add(new SetCardInfo("Jaheira, Friend of the Forest", 237, Rarity.RARE, mage.cards.j.JaheiraFriendOfTheForest.class));
        cards.add(new SetCardInfo("Jan Jansen, Chaos Crafter", 277, Rarity.RARE, mage.cards.j.JanJansenChaosCrafter.class));
        cards.add(new SetCardInfo("Javelin of Lightning", 185, Rarity.COMMON, mage.cards.j.JavelinOfLightning.class));
        cards.add(new SetCardInfo("Juvenile Mist Dragon", 79, Rarity.UNCOMMON, mage.cards.j.JuvenileMistDragon.class));
        cards.add(new SetCardInfo("Karlach, Fury of Avernus", 186, Rarity.MYTHIC, mage.cards.k.KarlachFuryOfAvernus.class));
        cards.add(new SetCardInfo("Kindred Discovery", 81, Rarity.RARE, mage.cards.k.KindredDiscovery.class));
        cards.add(new SetCardInfo("Korlessa, Scale Singer", 280, Rarity.UNCOMMON, mage.cards.k.KorlessaScaleSinger.class));
        cards.add(new SetCardInfo("Lae'zel, Vlaakith's Champion", 29, Rarity.RARE, mage.cards.l.LaezelVlaakithsChampion.class));
        cards.add(new SetCardInfo("Legion Loyalty", 31, Rarity.MYTHIC, mage.cards.l.LegionLoyalty.class));
        cards.add(new SetCardInfo("Lightning Bolt", 187, Rarity.COMMON, mage.cards.l.LightningBolt.class));
        cards.add(new SetCardInfo("Livaan, Cultist of Tiamat", 188, Rarity.UNCOMMON, mage.cards.l.LivaanCultistOfTiamat.class));
        cards.add(new SetCardInfo("Lozhan, Dragons' Legacy", 281, Rarity.UNCOMMON, mage.cards.l.LozhanDragonsLegacy.class));
        cards.add(new SetCardInfo("Lulu, Loyal Hollyphant", 32, Rarity.UNCOMMON, mage.cards.l.LuluLoyalHollyphant.class));
        cards.add(new SetCardInfo("Lurking Green Dragon", 239, Rarity.COMMON, mage.cards.l.LurkingGreenDragon.class));
        cards.add(new SetCardInfo("Luxury Suite", 355, Rarity.RARE, mage.cards.l.LuxurySuite.class));
        cards.add(new SetCardInfo("Mahadi, Emporium Master", 282, Rarity.UNCOMMON, mage.cards.m.MahadiEmporiumMaster.class));
        cards.add(new SetCardInfo("Manifold Key", 319, Rarity.UNCOMMON, mage.cards.m.ManifoldKey.class));
        cards.add(new SetCardInfo("Manor Gate", 356, Rarity.COMMON, mage.cards.m.ManorGate.class));
        cards.add(new SetCardInfo("Marble Diamond", 320, Rarity.COMMON, mage.cards.m.MarbleDiamond.class));
        cards.add(new SetCardInfo("Marching Duodrone", 321, Rarity.COMMON, mage.cards.m.MarchingDuodrone.class));
        cards.add(new SetCardInfo("Martial Impetus", 33, Rarity.COMMON, mage.cards.m.MartialImpetus.class));
        cards.add(new SetCardInfo("Meteor Golem", 323, Rarity.UNCOMMON, mage.cards.m.MeteorGolem.class));
        cards.add(new SetCardInfo("Mind Stone", 325, Rarity.UNCOMMON, mage.cards.m.MindStone.class));
        cards.add(new SetCardInfo("Minimus Containment", 34, Rarity.COMMON, mage.cards.m.MinimusContainment.class));
        cards.add(new SetCardInfo("Minsc & Boo, Timeless Heroes", 285, Rarity.MYTHIC, mage.cards.m.MinscBooTimelessHeroes.class));
        cards.add(new SetCardInfo("Mocking Doppelganger", 667, Rarity.RARE, mage.cards.m.MockingDoppelganger.class));
        cards.add(new SetCardInfo("Mold Folk", 133, Rarity.COMMON, mage.cards.m.MoldFolk.class));
        cards.add(new SetCardInfo("Monster Manual", 242, Rarity.RARE, mage.cards.m.MonsterManual.class));
        cards.add(new SetCardInfo("Moonshae Pixie", 84, Rarity.UNCOMMON, mage.cards.m.MoonshaePixie.class));
        cards.add(new SetCardInfo("Morphic Pool", 357, Rarity.RARE, mage.cards.m.MorphicPool.class));
        cards.add(new SetCardInfo("Moss Diamond", 327, Rarity.COMMON, mage.cards.m.MossDiamond.class));
        cards.add(new SetCardInfo("Mountain", 463, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Murder", 134, Rarity.COMMON, mage.cards.m.Murder.class));
        cards.add(new SetCardInfo("Myconid Spore Tender", 243, Rarity.COMMON, mage.cards.m.MyconidSporeTender.class));
        cards.add(new SetCardInfo("Myrkul's Edict", 135, Rarity.COMMON, mage.cards.m.MyrkulsEdict.class));
        cards.add(new SetCardInfo("Myrkul's Invoker", 136, Rarity.COMMON, mage.cards.m.MyrkulsInvoker.class));
        cards.add(new SetCardInfo("Mystery Key", 85, Rarity.UNCOMMON, mage.cards.m.MysteryKey.class));
        cards.add(new SetCardInfo("Nalia de'Arnise", 649, Rarity.MYTHIC, mage.cards.n.NaliaDeArnise.class));
        cards.add(new SetCardInfo("Nature's Lore", 244, Rarity.COMMON, mage.cards.n.NaturesLore.class));
        cards.add(new SetCardInfo("Nautiloid Ship", 328, Rarity.MYTHIC, mage.cards.n.NautiloidShip.class));
        cards.add(new SetCardInfo("Navigation Orb", 329, Rarity.COMMON, mage.cards.n.NavigationOrb.class));
        cards.add(new SetCardInfo("Nemesis Phoenix", 189, Rarity.UNCOMMON, mage.cards.n.NemesisPhoenix.class));
        cards.add(new SetCardInfo("Nimbleclaw Adept", 86, Rarity.COMMON, mage.cards.n.NimbleclawAdept.class));
        cards.add(new SetCardInfo("Nimblewright Schematic", 330, Rarity.COMMON, mage.cards.n.NimblewrightSchematic.class));
        cards.add(new SetCardInfo("Nine-Fingers Keene", 289, Rarity.RARE, mage.cards.n.NineFingersKeene.class));
        cards.add(new SetCardInfo("Noble's Purse", 331, Rarity.UNCOMMON, mage.cards.n.NoblesPurse.class));
        cards.add(new SetCardInfo("Nothic", 138, Rarity.UNCOMMON, mage.cards.n.Nothic.class));
        cards.add(new SetCardInfo("Oceanus Dragon", 87, Rarity.COMMON, mage.cards.o.OceanusDragon.class));
        cards.add(new SetCardInfo("Oji, the Exquisite Blade", 290, Rarity.UNCOMMON, mage.cards.o.OjiTheExquisiteBlade.class));
        cards.add(new SetCardInfo("Overwhelming Encounter", 245, Rarity.UNCOMMON, mage.cards.o.OverwhelmingEncounter.class));
        cards.add(new SetCardInfo("Owlbear Shepherd", 247, Rarity.UNCOMMON, mage.cards.o.OwlbearShepherd.class));
        cards.add(new SetCardInfo("Pack Attack", 190, Rarity.COMMON, mage.cards.p.PackAttack.class));
        cards.add(new SetCardInfo("Parasitic Impetus", 140, Rarity.COMMON, mage.cards.p.ParasiticImpetus.class));
        cards.add(new SetCardInfo("Passageway Seer", 141, Rarity.UNCOMMON, mage.cards.p.PassagewaySeer.class));
        cards.add(new SetCardInfo("Patriar's Seal", 332, Rarity.UNCOMMON, mage.cards.p.PatriarsSeal.class));
        cards.add(new SetCardInfo("Patron of the Arts", 191, Rarity.COMMON, mage.cards.p.PatronOfTheArts.class));
        cards.add(new SetCardInfo("Pilgrim's Eye", 333, Rarity.COMMON, mage.cards.p.PilgrimsEye.class));
        cards.add(new SetCardInfo("Plains", 451, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Poison the Blade", 248, Rarity.COMMON, mage.cards.p.PoisonTheBlade.class));
        cards.add(new SetCardInfo("Predatory Impetus", 249, Rarity.COMMON, mage.cards.p.PredatoryImpetus.class));
        cards.add(new SetCardInfo("Prized Statue", 334, Rarity.COMMON, mage.cards.p.PrizedStatue.class));
        cards.add(new SetCardInfo("Prophetic Prism", 335, Rarity.COMMON, mage.cards.p.PropheticPrism.class));
        cards.add(new SetCardInfo("Pseudodragon Familiar", 88, Rarity.COMMON, mage.cards.p.PseudodragonFamiliar.class));
        cards.add(new SetCardInfo("Psychic Impetus", 89, Rarity.COMMON, mage.cards.p.PsychicImpetus.class));
        cards.add(new SetCardInfo("Raised by Giants", 250, Rarity.RARE, mage.cards.r.RaisedByGiants.class));
        cards.add(new SetCardInfo("Raphael, Fiendish Savior", 292, Rarity.RARE, mage.cards.r.RaphaelFiendishSavior.class));
        cards.add(new SetCardInfo("Rasaad yn Bashir", 37, Rarity.UNCOMMON, mage.cards.r.RasaadYnBashir.class));
        cards.add(new SetCardInfo("Reckless Barbarian", 193, Rarity.COMMON, mage.cards.r.RecklessBarbarian.class));
        cards.add(new SetCardInfo("Recruitment Drive", 38, Rarity.COMMON, mage.cards.r.RecruitmentDrive.class));
        cards.add(new SetCardInfo("Reflecting Pool", 358, Rarity.RARE, mage.cards.r.ReflectingPool.class));
        cards.add(new SetCardInfo("Renari, Merchant of Marvels", 90, Rarity.UNCOMMON, mage.cards.r.RenariMerchantOfMarvels.class));
        cards.add(new SetCardInfo("Rilsa Rael, Kingpin", 293, Rarity.UNCOMMON, mage.cards.r.RilsaRaelKingpin.class));
        cards.add(new SetCardInfo("Robe of the Archmagi", 91, Rarity.RARE, mage.cards.r.RobeOfTheArchmagi.class));
        cards.add(new SetCardInfo("Roving Harper", 40, Rarity.COMMON, mage.cards.r.RovingHarper.class));
        cards.add(new SetCardInfo("Run Away Together", 92, Rarity.COMMON, mage.cards.r.RunAwayTogether.class));
        cards.add(new SetCardInfo("Saddle of the Cavalier", 251, Rarity.UNCOMMON, mage.cards.s.SaddleOfTheCavalier.class));
        cards.add(new SetCardInfo("Safana, Calimport Cutthroat", 143, Rarity.UNCOMMON, mage.cards.s.SafanaCalimportCutthroat.class));
        cards.add(new SetCardInfo("Sailors' Bane", 93, Rarity.UNCOMMON, mage.cards.s.SailorsBane.class));
        cards.add(new SetCardInfo("Sapphire Dragon", 94, Rarity.UNCOMMON, mage.cards.s.SapphireDragon.class));
        cards.add(new SetCardInfo("Sarevok, Deathbringer", 144, Rarity.UNCOMMON, mage.cards.s.SarevokDeathbringer.class));
        cards.add(new SetCardInfo("Scouting Hawk", 41, Rarity.COMMON, mage.cards.s.ScoutingHawk.class));
        cards.add(new SetCardInfo("Sea Gate", 359, Rarity.COMMON, mage.cards.s.SeaGate.class));
        cards.add(new SetCardInfo("Sea Hag", 95, Rarity.COMMON, mage.cards.s.SeaHag.class));
        cards.add(new SetCardInfo("Sea of Clouds", 360, Rarity.RARE, mage.cards.s.SeaOfClouds.class));
        cards.add(new SetCardInfo("Seasoned Dungeoneer", 660, Rarity.RARE, mage.cards.s.SeasonedDungeoneer.class));
        cards.add(new SetCardInfo("Sewer Nemesis", 777, Rarity.RARE, mage.cards.s.SewerNemesis.class));
        cards.add(new SetCardInfo("Shadowheart, Dark Justiciar", 146, Rarity.RARE, mage.cards.s.ShadowheartDarkJusticiar.class));
        cards.add(new SetCardInfo("Shameless Charlatan", 96, Rarity.RARE, mage.cards.s.ShamelessCharlatan.class));
        cards.add(new SetCardInfo("Sharpshooter Elf", 253, Rarity.UNCOMMON, mage.cards.s.SharpshooterElf.class));
        cards.add(new SetCardInfo("Shiny Impetus", 194, Rarity.COMMON, mage.cards.s.ShinyImpetus.class));
        cards.add(new SetCardInfo("Silvanus's Invoker", 254, Rarity.COMMON, mage.cards.s.SilvanussInvoker.class));
        cards.add(new SetCardInfo("Skanos Dragonheart", 255, Rarity.UNCOMMON, mage.cards.s.SkanosDragonheart.class));
        cards.add(new SetCardInfo("Skullport Merchant", 149, Rarity.UNCOMMON, mage.cards.s.SkullportMerchant.class));
        cards.add(new SetCardInfo("Skullwinder", 256, Rarity.UNCOMMON, mage.cards.s.Skullwinder.class));
        cards.add(new SetCardInfo("Sky Diamond", 337, Rarity.COMMON, mage.cards.s.SkyDiamond.class));
        cards.add(new SetCardInfo("Slaughter the Strong", 43, Rarity.UNCOMMON, mage.cards.s.SlaughterTheStrong.class));
        cards.add(new SetCardInfo("Solemn Doomguide", 672, Rarity.RARE, mage.cards.s.SolemnDoomguide.class));
        cards.add(new SetCardInfo("Spectacular Showdown", 679, Rarity.RARE, mage.cards.s.SpectacularShowdown.class));
        cards.add(new SetCardInfo("Spire Garden", 361, Rarity.RARE, mage.cards.s.SpireGarden.class));
        cards.add(new SetCardInfo("Steadfast Unicorn", 44, Rarity.COMMON, mage.cards.s.SteadfastUnicorn.class));
        cards.add(new SetCardInfo("Stirge", 150, Rarity.COMMON, mage.cards.s.Stirge.class));
        cards.add(new SetCardInfo("Stirring Bard", 195, Rarity.COMMON, mage.cards.s.StirringBard.class));
        cards.add(new SetCardInfo("Stoneskin", 45, Rarity.UNCOMMON, mage.cards.s.Stoneskin.class));
        cards.add(new SetCardInfo("Stonespeaker Crystal", 338, Rarity.UNCOMMON, mage.cards.s.StonespeakerCrystal.class));
        cards.add(new SetCardInfo("Street Urchin", 197, Rarity.UNCOMMON, mage.cards.s.StreetUrchin.class));
        cards.add(new SetCardInfo("Summon Undead", 151, Rarity.COMMON, mage.cards.s.SummonUndead.class));
        cards.add(new SetCardInfo("Swamp", 459, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swashbuckler Extraordinaire", 198, Rarity.UNCOMMON, mage.cards.s.SwashbucklerExtraordinaire.class));
        cards.add(new SetCardInfo("Swiftfoot Boots", 339, Rarity.UNCOMMON, mage.cards.s.SwiftfootBoots.class));
        cards.add(new SetCardInfo("Sword Coast Sailor", 98, Rarity.UNCOMMON, mage.cards.s.SwordCoastSailor.class));
        cards.add(new SetCardInfo("Sword Coast Serpent", 99, Rarity.COMMON, mage.cards.s.SwordCoastSerpent.class));
        cards.add(new SetCardInfo("Tabaxi Toucaneers", 46, Rarity.COMMON, mage.cards.t.TabaxiToucaneers.class));
        cards.add(new SetCardInfo("Tasha, the Witch Queen", 294, Rarity.MYTHIC, mage.cards.t.TashaTheWitchQueen.class));
        cards.add(new SetCardInfo("Taunting Kobold", 199, Rarity.UNCOMMON, mage.cards.t.TauntingKobold.class));
        cards.add(new SetCardInfo("The Council of Four", 271, Rarity.RARE, mage.cards.t.TheCouncilOfFour.class));
        cards.add(new SetCardInfo("Thieves' Tools", 152, Rarity.COMMON, mage.cards.t.ThievesTools.class));
        cards.add(new SetCardInfo("Thrakkus the Butcher", 295, Rarity.UNCOMMON, mage.cards.t.ThrakkusTheButcher.class));
        cards.add(new SetCardInfo("Thunderwave", 201, Rarity.UNCOMMON, mage.cards.t.Thunderwave.class));
        cards.add(new SetCardInfo("Tiamat's Fanatics", 202, Rarity.COMMON, mage.cards.t.TiamatsFanatics.class));
        cards.add(new SetCardInfo("Tomb of Horrors Adventurer", 100, Rarity.RARE, mage.cards.t.TombOfHorrorsAdventurer.class));
        cards.add(new SetCardInfo("Topaz Dragon", 153, Rarity.UNCOMMON, mage.cards.t.TopazDragon.class));
        cards.add(new SetCardInfo("Traverse the Outlands", 258, Rarity.RARE, mage.cards.t.TraverseTheOutlands.class));
        cards.add(new SetCardInfo("Treasure Keeper", 341, Rarity.UNCOMMON, mage.cards.t.TreasureKeeper.class));
        cards.add(new SetCardInfo("Two-Handed Axe", 203, Rarity.UNCOMMON, mage.cards.t.TwoHandedAxe.class));
        cards.add(new SetCardInfo("Tymora's Invoker", 101, Rarity.COMMON, mage.cards.t.TymorasInvoker.class));
        cards.add(new SetCardInfo("Uchuulon", 673, Rarity.RARE, mage.cards.u.Uchuulon.class));
        cards.add(new SetCardInfo("Undercellar Myconid", 259, Rarity.COMMON, mage.cards.u.UndercellarMyconid.class));
        cards.add(new SetCardInfo("Underdark Explorer", 154, Rarity.COMMON, mage.cards.u.UnderdarkExplorer.class));
        cards.add(new SetCardInfo("Undermountain Adventurer", 260, Rarity.RARE, mage.cards.u.UndermountainAdventurer.class));
        cards.add(new SetCardInfo("Universal Solvent", 342, Rarity.COMMON, mage.cards.u.UniversalSolvent.class));
        cards.add(new SetCardInfo("Veteran Soldier", 48, Rarity.UNCOMMON, mage.cards.v.VeteranSoldier.class));
        cards.add(new SetCardInfo("Vicious Battlerager", 155, Rarity.COMMON, mage.cards.v.ViciousBattlerager.class));
        cards.add(new SetCardInfo("Viconia, Drow Apostate", 156, Rarity.UNCOMMON, mage.cards.v.ViconiaDrowApostate.class));
        cards.add(new SetCardInfo("Vrock", 157, Rarity.UNCOMMON, mage.cards.v.Vrock.class));
        cards.add(new SetCardInfo("Wand of Wonder", 204, Rarity.RARE, mage.cards.w.WandOfWonder.class));
        cards.add(new SetCardInfo("Warehouse Thief", 205, Rarity.COMMON, mage.cards.w.WarehouseThief.class));
        cards.add(new SetCardInfo("Wayfarer's Bauble", 344, Rarity.COMMON, mage.cards.w.WayfarersBauble.class));
        cards.add(new SetCardInfo("White Plume Adventurer", 49, Rarity.RARE, mage.cards.w.WhitePlumeAdventurer.class));
        cards.add(new SetCardInfo("Wilson, Refined Grizzly", 261, Rarity.UNCOMMON, mage.cards.w.WilsonRefinedGrizzly.class));
        cards.add(new SetCardInfo("Winter Eladrin", 104, Rarity.COMMON, mage.cards.w.WinterEladrin.class));
        cards.add(new SetCardInfo("Wyll, Blade of Frontiers", 208, Rarity.RARE, mage.cards.w.WyllBladeOfFrontiers.class));
        cards.add(new SetCardInfo("Wyrm's Crossing Patrol", 51, Rarity.COMMON, mage.cards.w.WyrmsCrossingPatrol.class));
        cards.add(new SetCardInfo("You Meet in a Tavern", 263, Rarity.COMMON, mage.cards.y.YouMeetInATavern.class));
        cards.add(new SetCardInfo("You're Confronted by Robbers", 53, Rarity.COMMON, mage.cards.y.YoureConfrontedByRobbers.class));
        cards.add(new SetCardInfo("Young Blue Dragon", 106, Rarity.COMMON, mage.cards.y.YoungBlueDragon.class));
        cards.add(new SetCardInfo("Young Red Dragon", 210, Rarity.COMMON, mage.cards.y.YoungRedDragon.class));
        cards.add(new SetCardInfo("Your Temple Is Under Attack", 52, Rarity.COMMON, mage.cards.y.YourTempleIsUnderAttack.class));
        cards.add(new SetCardInfo("Zellix, Sanity Flayer", 652, Rarity.MYTHIC, mage.cards.z.ZellixSanityFlayer.class));
        cards.add(new SetCardInfo("Zevlor, Elturel Exile", 296, Rarity.RARE, mage.cards.z.ZevlorElturelExile.class));
        cards.add(new SetCardInfo("Zhentarim Bandit", 158, Rarity.COMMON, mage.cards.z.ZhentarimBandit.class));
    }
}
