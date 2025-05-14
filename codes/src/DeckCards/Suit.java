package DeckCards;

public enum Suit {
    HEARTS,
    SPADES,
    CLUBS,
    DIAMONDS;

    @Override
    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase();
    }
}
