package DeckCards;

import java.util.Objects;

public class Card implements Comparable<Card> {

    private final Suit suit;
    private final Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public static Card compareByRank(Card card1, Card card2) {
        return card1.rank.getVal() >= card2.rank.getVal() ? card1 : card2;
    }

    @Override
    public int compareTo(Card o) {
        int suitCompare = this.suit.compareTo(o.suit);
        if(suitCompare!=0){
            return suitCompare;
        }
        return Integer.compare(o.rank.getVal(), this.rank.getVal());
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card card)) return false;
        return suit == card.suit && rank == card.rank;
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, rank);
    }
}
