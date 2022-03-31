import java.util.ArrayList;

public class Deck {


    private ArrayList<Card> cards = new ArrayList<>();

    public ArrayList<Card> getCards() {
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

}
