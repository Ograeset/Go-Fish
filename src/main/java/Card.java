public class Card {
    private final Deck.Suit suit;
    private final Deck.Number number;

    public Card(Deck.Suit suit, Deck.Number number) {
        this.suit = suit;
        this.number = number;
    }

    public String toString(){
        return number + " of " + suit;
    }
}


