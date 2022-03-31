import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayingCardTest {

    @Disabled
    public void checkDeckSizeAtStart(){
        GoFish goFish = new GoFish();
            assertEquals(52, goFish.getCards().size());
    }
}
