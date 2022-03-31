import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PlayingCardTest {


    @Test
    public void shouldBe52(){

        Deck deck = new Deck();
        deck.initDeck();
        assertEquals(52,deck.getCards().size());

    }

    @Test
    public  void shuffle(){

        Deck shuffled = new Deck();
        shuffled.initDeck();
        shuffled.shuffle();

        System.out.println("Shuffled deck: " + shuffled);
    }

    @Test
    public void playerCardsShouldNotBeNull(){
        GoFish goFish = new GoFish();
        goFish.run();
        System.out.println(goFish.playerOne.hand + "\n" + goFish.playerTwo.hand);
        assertNotNull(goFish.playerOne.hand + "\n" + goFish.playerTwo.hand);
    }
}
