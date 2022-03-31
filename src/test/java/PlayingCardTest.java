import org.junit.jupiter.api.*;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class PlayingCardTest {

    GoFish goFish = new GoFish();

    @DisplayName("Skapar appen")
    @BeforeEach
    public void initiateGame(){
        goFish.run();
    }

    @Test
    public void shouldBe52(){

        Assertions.assertTrue(goFish.deck.getBool());

    }

    @RepeatedTest(10)
    public  void shuffle(){

        Deck shuffled = new Deck();
        shuffled.initDeck();
        shuffled.shuffle();

        System.out.println("Shuffled deck: " + shuffled);
    }

    @Test
    public void playerCardsShouldNotBeNull(){

        System.out.println(goFish.playerOne.hand);
        assertNotNull(goFish.playerOne.hand);
    }

    @Test
    public void dealCards(){

        for (int i = 0; i <8 ; i++) {
            goFish.playerOne.hand.add(goFish.deck.getCards().poll());
        }

        System.out.println(goFish.playerOne.hand);
        Assertions.assertNotEquals("", goFish.playerOne.hand);
    }
}
