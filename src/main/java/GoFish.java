import java.util.ArrayList;
import java.util.List;

public class GoFish {
    Player playerOne;
    Player playerTwo;
    Deck deck;

    public static void main(String[] args) {


    }

    public void run(){

        this.playerOne = new Player();
        this.playerTwo = new Player();
        this.deck = new Deck();

        this.deck.initDeck();
        this.deck.shuffle();
        deal();

    }

    public void deal () {

        for (int i = 0; i <7 ; i++) {
            playerOne.hand.add(deck.getCards().poll());
            playerTwo.hand.add(deck.getCards().poll());
        }
    }

}
