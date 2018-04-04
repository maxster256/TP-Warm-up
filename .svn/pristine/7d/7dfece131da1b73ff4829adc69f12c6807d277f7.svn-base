import com.sun.media.sound.InvalidDataException;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.lang.reflect.Array;

import static org.junit.Assert.*;

public class DeckTest {

    private Deck deck52;

    @Before // Also @BeforeClass
    public void testSetUp() {
        deck52 = new Deck(52);
        deck52.printDeck();
    }

    @Test (expected = IllegalArgumentException.class)
    public void failToCreateDeckIfInvalidSizeIsProvided() throws IllegalArgumentException {
        Deck deck16 = new Deck(16);
    }

    @Test (timeout = 1000)
    public void sortDeckInDesiredTimeframe() throws Exception {
        deck52.sort();
    }

    @Ignore ("We've yet to define the sorting exception.")
    @Test (expected = InvalidDataException.class)
    public void failToShuffleTheDeck() throws InvalidDataException {
        deck52.shuffle();
    }

    @Test
    public void printDeckToConsole() throws Exception {
        assertNotNull(deck52);
    }

    @Test
    public void checkIfTheDeckConvertsToArray() throws Exception {
        deck52.toArray();
    }

    @Test (expected = AssertionError.class)
    public void validateDeckIntegrityAfterSort() throws Exception {
        deck52.sort();
        assertNull(deck52);  // Checks whether the deck has become null or not
    }

    @After // Also @AfterClass
    public void testFinish() {
        deck52.printDeck();
    }

}