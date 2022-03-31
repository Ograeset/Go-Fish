public class Card {
    public final Deck.Suit suit;
    public final Deck.Number number;

    public Card(Deck.Suit suit, Deck.Number number) {
        this.suit = suit;
        this.number = number;
    }

    public String toString(){
        return number + " of " + suit;
    }
}


