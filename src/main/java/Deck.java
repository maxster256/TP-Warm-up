import java.util.*;

class Deck extends Stack<Card> {

    Deck(int numberOfCardsInDeck) throws IllegalArgumentException {

        if (numberOfCardsInDeck!= 52 && numberOfCardsInDeck != 32 && numberOfCardsInDeck != 24)
            throw new IllegalArgumentException();
        else {

            int cardsPerColour = numberOfCardsInDeck / 4;

            // Create an array holding different values the cards are able to get
            ArrayList<CardValue> cardValuesArray = new ArrayList<>();
            Collections.addAll(cardValuesArray, CardValue.values());

            // Create a new deck according to the desired size
            for (int i = 0; i < cardsPerColour; i++)
                for (CardSuit suit : CardSuit.values())
                    add(new Card(suit, cardValuesArray.get(i)));
        }
    }

    /**
     * Sorts by the value of the card (descending)
     */
    void sort() {
        this.sort((o1, o2) -> {
            if (o1.value.ordinal() > o2.value.ordinal())
                return 1;
            else
                return -1;
        });
    }

    void shuffle() {
        Collections.shuffle(this);
    }

    void printDeck() {
        int count = 0;
        for (Card card: this) {
            // System.out.println(count + ") Suit: " + card.suit + ", value: " + card.value);
            count++;
        }
    }

    Card getTopCard() {
        return firstElement();
    }

}
