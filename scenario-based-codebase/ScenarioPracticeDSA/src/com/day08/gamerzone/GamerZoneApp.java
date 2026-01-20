/*
 8. GamerZone – High Score Ranking System (Quick Sort)
Story: 
	● A global multiplayer game needs to rank thousands of players in real-time based on their
	  scores after every match. The list is dynamic, large, and often unsorted. 
	● Quick Sort is used to reorder players quickly for leaderboards.
Concepts Involved:
	● Quick Sort
	● Sorting dynamic, large datasets
	● Performance-driven solution
*/
package com.day08.gamerzone;

public class GamerZoneApp {
	public static void main(String[] args) {
		LeaderboardManager manager = new LeaderboardManager();

		// Added example players after some matches (unsorted)
		Player[] leaderboard = { new Player("ShadowNinja", 12450, "Asia"), new Player("xProGamer", 9800, "Europe"),
				new Player("FireQueen", 15670, "NA"), new Player("DragonSlayer", 14230, "Asia"),
				new Player("IceWizard42", 8750, "Europe"), new Player("ThunderX", 19840, "NA"),
				new Player("PixelKiller", 11220, "SA"), new Player("MoonWalker", 16780, "Asia"),
				new Player("GhostRider", 13450, "Europe"), new Player("BlazeKing", 14560, "NA") };

		System.out.println("Before sorting (unsorted scores):");
		manager.showTopPlayers(leaderboard, 10);
		System.out.println();

		// Sort using Quick Sort
		manager.sortLeaderboard(leaderboard);

		System.out.println("After Quick Sort - Global Leaderboard (Top 10):");
		manager.showTopPlayers(leaderboard, 10);

		System.out.println("\nTotal players ranked: " + leaderboard.length);
	}
}