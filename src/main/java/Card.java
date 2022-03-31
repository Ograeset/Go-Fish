public class Card {
    private final Suit suit;
    private final Number number;

    public Card(Suit suit, Number number) {
        this.suit = suit;
        this.number = number;
    }


    public enum Number { Two, Three, Four, Five, Six, Seven,
        Eight, Nine, Ten, Jack, Queen, King, Ace }

    public enum Suit { Spades, Hearts, Clubs, Diamonds }
}


