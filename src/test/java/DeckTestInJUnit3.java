import junit.framework.TestCase;

public class DeckTestInJUnit3 extends TestCase {

    private final Deck deck52 = new Deck(52);

    public void testIfFailsToCreateDeckIfInvalidSizeIsProvided() throws IllegalArgumentException {
        try {
            Deck deck16 = new Deck(16);
            fail( "The exception has not been thrown, indicating an error in code." );
        } catch(IllegalArgumentException iae) {
            System.out.println("The code behaves properly when invalid size is provided.");
        }
    }

    public void testIfShuffledTopValueCard() throws Exception {
        Deck secondDeck52 = new Deck(52);

        deck52.shuffle();

        assertNotSame(deck52.getTopCard().value, secondDeck52.getTopCard().value);
    }

    public void testIfCardsAreGeneratedInCorrectOrder() throws Exception {
        Deck deck32 = new Deck(32);

        assertSame(deck52.getTopCard().value, deck32.getTopCard().value);
        assertSame(deck52.getTopCard().suit, deck32.getTopCard().suit);
    }

    public void testIfTopCardIsNotNull() throws Exception {
        assertNotNull(deck52.getTopCard());
    }

    public void testIfSortsDescendingByValue() throws Exception {
        Deck secondDeck52 = new Deck(52);

        deck52.shuffle();
        secondDeck52.shuffle();

        deck52.sort();
        secondDeck52.sort();

        assertTrue(deck52.getTopCard().value == secondDeck52.getTopCard().value);
    }
}