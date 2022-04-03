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
        System.out.println("-------------Här börjar testet----------------");
        goFish.run();
    }

    @AfterEach
    public void message(){
        System.out.println("-------------Här slutar testet-------------");
    }

    @Test
    public void shouldBe52(){

        Assertions.assertTrue(goFish.deck.getBool());

    }


    @RepeatedTest(4)
    public  void shuffle(){

        Deck shuffled = new Deck();
        shuffled.initDeck();
        shuffled.shuffle();

        System.out.println("Shuffled deck: " + shuffled);
    }

    @Test
    public void dealCards(){

        for (int i = 0; i <7 ; i++) {
            goFish.playerOne.hand.add(goFish.deck.getCards().poll());
        }

        Assertions.assertNotEquals("", goFish.playerOne.hand.toString());
    }

    // Nasir test
    @Test
    public void sizeOfHandShouldReturnSeven () {

        assertEquals(7, goFish.playerOne.hand.size());
    }

    /*******    Slut Nasir test           *********/


    /****          Början Andreas test    ****/
    @Test
    public void checkIfListIsAListOfCards(){
        Assertions.assertTrue(goFish.deck.getCards() instanceof LinkedList<Card>);
    }

    @Test
    public void playerCardsShouldNotBeNull(){

        assertNotNull(goFish.playerOne.hand);
    }

    /*******    Slut Andreas test           *********/



    @Test//Jonas test
    public void checkIfDeckHasLessCardsAfterDealing(){
        goFish.playerOne.hand.add(goFish.deck.getCards().poll());
        Assertions.assertNotEquals(52,goFish.deck.getCards().size());
    }

}
