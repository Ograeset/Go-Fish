import java.util.ArrayList;

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

    }

    public void draw(){

        playerOne.hand.add(deck.getCards().poll());

    }
}
