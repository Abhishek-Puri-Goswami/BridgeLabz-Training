/*
2. AVL Tree
Story: Gaming App - Real-Time Leaderboard
	Gamers earn and lose points rapidly.
Scenarios:
	● 🔹 Scenario 1: Insert/Update Player — New players join or existing ones gain points.
	● 🔹 Scenario 2: Display Top Players — Return top 10 players in rank.
	● 🔹 Scenario 3: Remove Player — Handle user bans or exits efficiently.
*/

package com.day10.gamingapp;

public class GamingLeaderboardApp {

    public static void main(String[] args) {
        AVLLeaderboard leaderboard = new AVLLeaderboard();

        System.out.println("===============================================================");
        System.out.println("                    REAL-TIME GAMING LEADERBOARD");
        System.out.println("===============================================================");

        // Scenario 1: Players join / gain points
        leaderboard.insertOrUpdate(new Player("user_abc123", "ShadowNinja",  14500, "Asia"));
        leaderboard.insertOrUpdate(new Player("user_xyz789", "FireQueen",    18200, "NA"));
        leaderboard.insertOrUpdate(new Player("user_456def", "ThunderX",     21000, "EU"));
        leaderboard.insertOrUpdate(new Player("user_pqr111", "MoonWalker",   16800, "Asia"));
        leaderboard.insertOrUpdate(new Player("user_ghi222", "BlazeKing",    19500, "NA"));

        System.out.println("Top 5 players after initial joins:");
        leaderboard.showTopPlayers(5);

        // Simulate score changes
        System.out.println("\nAfter some matches:");
        leaderboard.insertOrUpdate(new Player("user_abc123", "ShadowNinja",  15800, "Asia"));  // +1300
        leaderboard.insertOrUpdate(new Player("user_xyz789", "FireQueen",    17500, "NA"));    // -700

        leaderboard.showTopPlayers(5);

        // Scenario 3: Remove player (banned)
        System.out.println("\nPlayer 'ThunderX' banned → removed");
        leaderboard.remove("user_456def");

        System.out.println("\nUpdated leaderboard:");
        leaderboard.showTopPlayers(10);

        System.out.println("\nTotal active players: " + leaderboard.getPlayerCount());
        System.out.println("===============================================================");
    }
}