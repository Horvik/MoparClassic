package org.moparscape.msc.config;

import org.moparscape.msc.gs.Instance;

/**
 * Holds all important, commonly tweaked variables.
 * 
 * @author xEnt
 * 
 */
public class Constants {
	/**
	 * @category GameServer
	 */
	public static class GameServer {
		/**
		 * Message of the Day (Seen as you log in)
		 */
		public static String MOTD = "";
		/**
		 * Each time a connection is made to the server, this is incremented.
		 */
		public static int ACCEPTED_CONNECTIONS = 0;
		/**
		 * Strikes, Bolts & Blast Spells.
		 * 
		 * Remember, 30+ Magic damage gives you +1 damage, so these damages are
		 * -1 the absolute max. Level Requirement, Max Damage
		 */
		public static final int[][] SPELLS = { { 1, 1 }, { 4, 2 }, { 9, 2 },
				{ 13, 3 }, { 17, 3 }, { 23, 4 }, { 29, 4 }, { 35, 5 },
				{ 41, 5 }, { 47, 6 }, { 53, 6 }, { 59, 7 }, { 62, 8 },
				{ 65, 9 }, { 70, 10 }, { 75, 11 } };
		/**
		 * k ID's of all Undead-type of NPC's. (Used for crumble undead &
		 * sounds)
		 */
		public static final int[] UNDEAD_NPCS = { 15, 53, 80, 178, 664, 41, 52,
				68, 180, 214, 319, 40, 45, 46, 50, 179, 195 };
		/**
		 * ID's of all ARMOR type NPC's. (Used for armor hitting sounds)
		 */
		public static final int[] ARMOR_NPCS = { 66, 102, 189, 277, 322,
				401324, 323, 632, 633 };
		/**
		 * Maximum hit for Crumble Undead (Magic) spell. (Against undead)
		 */
		public static final int CRUMBLE_UNDEAD_MAX = 12;
		/**
		 * These NPCs are NPCs that are attackable, but do not run on low health
		 * such as Guards etc.
		 */
		public static final int[] NPCS_THAT_DONT_RETREAT = { 65, 102, 100, 127,
				258 };

	}

	/**
	 * @category IRC
	 */
	public static class IRC {
		/**
		 * to enable IRC integration or not.
		 */
		public static boolean USE_IRC = false;
		/**
		 * Hosts of the IRC channels
		 */
		public static final String[] HOSTS = { "irc.shakeababy.net" };
		/**
		 * Channels for the IRC bot to join Passwords in the second dimention
		 */
		public static final String[][] CHANNELS = { {
				"#org.moparscape.msc.staff", "staffonly" } };
		/**
		 * Channel for the IRC bot to join
		 */
		public static final String NICK = "msc_"
				+ (Config.members ? "P2P" : "F2P") + "_"
				+ Formulae.Rand(0, 900);
		/**
		 * the login/full name thing IRC wants. [NOT NICKNAME]
		 */
		public static final String USER = "org.moparscape.msc";
		/**
		 * Each person in here is their IRC name, if they are in here ALL
		 * Moderator in-game activities will be sent to them via PM.
		 */
		public static final String[] ADMINISTRATORS = { "KO9", "ollie",
				"Necroth", "Melshef" };
		/**
		 * Banned words you don't want your IRCBot to say (Optional) {Banned
		 * word, new mask}
		 */
		public static final String[][] BANNED_WORDS = { { "stork",
				"org.moparscape.msc" } };
	}

	/**
	 * @category LoginServer
	 */
	public static class LoginServer {

	}
}
