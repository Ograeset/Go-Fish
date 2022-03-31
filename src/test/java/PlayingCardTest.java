import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class PlayingCardTest {

    GoFish goFish = new GoFish();

    @BeforeEach
    public void initiateGame(){
        goFish.run();
    }

    @Test
    public void shouldBe52(){

        assertEquals(52,goFish.deck.getCards().size());

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
        
        System.out.println(goFish.playerOne.hand);
        assertNotNull(goFish.playerOne.hand);
    }

    @Test
    public void draw(){

        System.out.println(goFish.playerOne.hand);




    }
}
