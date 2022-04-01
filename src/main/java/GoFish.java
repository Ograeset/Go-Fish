public class GoFish {
    Player playerOne;
    Player playerTwo;
    Deck deck;

    public boolean main() {

        run();

        return true;
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
