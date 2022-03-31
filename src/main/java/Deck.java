import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Deck {


    private static LinkedList<Card> cards = new LinkedList<>();

    public LinkedList<Card> getCards() {
        return cards;
    }


    public enum Number { Two, Three, Four, Five, Six, Seven,
        Eight, Nine, Ten, Jack, Queen, King, Ace }

    public enum Suit { Spades, Hearts, Clubs, Diamonds }

    public void initDeck(){
        for (Suit s : Suit.values())
            for (Number n : Number.values())
                this.cards.add(new Card(s, n));
    }

    public static Card deal(){
        return cards.poll();
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

    public String toString() {

        return cards.toString();
    }

}
