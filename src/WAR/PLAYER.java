package WAR;


import java.util.ArrayList;
import java.util.List;

public class PLAYER {
    private List<CARD> hand;
    private int score;
    private String name;

    public PLAYER(String name) {
        this.name = name;
        hand = new ArrayList<CARD>();
        score = 0;
    }
    
    public String getName() {
    	return name;
    	
    }

    public void describe() {
        System.out.println("Player: " + name);
        for (CARD card : hand) {
            card.describe();
        }
    }

    public CARD flip() {
        if (!hand.isEmpty()) {
            return hand.remove(0);
        } else {
            return null;
        }
    }

    public void draw(DECK deck) {
        CARD drawnCard = deck.draw();
        if (drawnCard != null) {
            hand.add(drawnCard);
        }
    }

    public void incrementScore() {
        score++;
    }

    public int getScore() {
        return score;
    }
}
