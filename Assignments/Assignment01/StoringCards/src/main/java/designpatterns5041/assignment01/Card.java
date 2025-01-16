package designpatterns5041.assignment01;

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

    @Override
    public String toString() {
        char rankOutput = switch (rank) {
            case Two, Three, Four, Five, Six, Seven, Eight, Nine ->
                (char) ('2' + (rank.ordinal() - Rank.Two.ordinal()));
            case Ten -> 'T';
            case Jack -> 'J';
            case Queen -> 'Q';
            case King -> 'K';
            case Ace -> 'A';
            default -> '?';
        };

        char suitOutput = switch (suit) {
            case Clubs -> 'c';
            case Diamonds -> 'd';
            case Hearts -> 'h';
            case Spades -> 's';
            default -> '?';
        };

        return String.format("%c%c", rankOutput, suitOutput);
    }

    @Override
    public int compareTo(Card other) {
        return rank.ordinal() - other.rank.ordinal();
    }
}
