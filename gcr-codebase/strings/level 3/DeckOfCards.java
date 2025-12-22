import java.util.Scanner;
public class DeckOfCards {
    // Method to initialize the deck of cards
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck of cards
    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Method to distribute the cards to players
    public static String[][] distributeCards(String[] deck, int n, int players) {
        if (n * players > deck.length) {
            throw new IllegalArgumentException("Not enough cards to distribute");
        }

        String[][] distributedCards = new String[players][n];
        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < n; j++) {
                distributedCards[i][j] = deck[index++];
            }
        }
        return distributedCards;
    }

    // Method to print the players and their cards
    public static void printPlayersCards(String[][] playersCards) {
        for (int i = 0; i < playersCards.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (String card : playersCards[i]) {
                System.out.println("  " + card);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Initialize the deck
        String[] deck = initializeDeck();
        // Shuffle the deck
        shuffleDeck(deck);

        System.out.print("Enter number of players: ");
        int players = input.nextInt();
        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = input.nextInt();

        try {
            // Distribute the cards
            String[][] playersCards = distributeCards(deck, cardsPerPlayer, players);

            // Print the players and their cards
            printPlayersCards(playersCards);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        input.close();
    }
}
