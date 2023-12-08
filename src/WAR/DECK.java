package WAR;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<Card>();
        initializeDeck();
    }

    private void initializeDeck() {
        for (int value = 2; value <= 14; value++) {
            for (String suit : new String[] { "Hearts", "Diamonds", "Clubs", "Spades" }) {
                String name = getValueName(value) + " of " + suit;
                Card card = new Card(value, name);
                cards.add(card);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card draw() {
        if (!cards.isEmpty()) {
            return cards.remove(0);
        } else {
            return null;
        }
    }

    private String getValueName(int value) {
        return String.valueOf(value);
    }
}
