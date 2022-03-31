import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayingCardTest {

/*    @Disabled
    public void checkDeckSizeAtStart(){
        GoFish goFish = new GoFish();
            assertEquals(52, goFish.getCards().size());
    }
*/

    @Test
    public void shouldBe52(){
        Deck deck = new Deck();
        deck.initDeck();
        assertEquals(52,deck.getCards().size() );
    }

    
}
