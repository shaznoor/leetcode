package DeckCards;

public class DeckDemo {
    public static void main(String[] args) {
        // Problem 1: Compare two cards by rank
        Card aceOfHearts = new Card(Suit.HEARTS, Rank.ACE);
        Card kingOfSpades = new Card(Suit.SPADES, Rank.KING);

        Card higherCard = Card.compareByRank(aceOfHearts, kingOfSpades);
        System.out.println("Higher card is: " + higherCard);

        // Problem 2: Sort a shuffled deck
        Deck deck = new Deck();
        System.out.println("Original deck:");
        System.out.println(deck);

        deck.shuffle();
        System.out.println("\nShuffled deck:");
        System.out.println(deck);

        deck.sort();
        System.out.println("\nSorted deck (by suit then rank):");
        System.out.println(deck);
    }
}