public class Card {
    public final String suit;
    public final String number;

    public Card(String suit, String number) {
        this.suit = suit;
        this.number = number;
    }

    public String toString(){
        return number + " of " + suit;
    }
}


