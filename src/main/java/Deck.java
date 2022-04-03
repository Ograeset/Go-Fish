import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Deck {


    private static LinkedList<Card> cards = new LinkedList<>();


    public LinkedList<Card> getCards() {
        return cards;
    }


    public boolean getBool(){
        if(cards.size()==52){
            return false;
        }else return true;
    }

    public String[] Numbers = {"Two", "Three", "Four", "Five", "Six", "Seven",
            "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};

    public String[] Suit = { "Spades", "Hearts", "Clubs", "Diamonds" };

/*    public enum Number { Two, Three, Four, Five, Six, Seven,
        Eight, Nine, Ten, Jack, Queen, King, Ace }

    public enum Suit { Spades, Hearts, Clubs, Diamonds }
*/


    public void initDeck(){
        for (String s : Suit)
            for (String n : Numbers)
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
