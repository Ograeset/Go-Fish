import java.util.LinkedList;

public class Player {
    LinkedList<Card> hand = new LinkedList<>();

    public void deal(){

        for (int i = 0; i < 8; i++) {
            Deck.deal();
        }
    }
}
