package DeckCards;

public enum Rank {
    ACE(14),
    KING(13),
    QUEEN(12),
    JACK(11),
    TEN(10),
    NINE(9),
    EIGHT(8),
    SEVEN(7),
    SIX(6),
    FIVE(5),
    FOUR(4),
    THREE(3),
    TWO(2);

    private final int value;

    Rank(int val) {
        this.value = val;
    }

    public int getVal() {
        return value;
    }

    @Override
    public String toString() {
        if (value > 10) {
            return name().charAt(0) + name().substring(1).toLowerCase();
        }
        return String.valueOf(value);
    }
}
