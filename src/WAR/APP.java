package WAR;

public class App {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Player player1 = new Player("Alex");
        Player player2 = new Player("Arya");

        deck.shuffle();

        for (int i = 0; i < 26; i++) {
            player1.draw(deck);
            player2.draw(deck);
        }

        for (int round = 1; round <= 26; round++) {
            Card card1 = player1.flip();
            Card card2 = player2.flip();

            System.out.println("Round " + round);
            System.out.println(player1.getName() + " flips:");
            card1.describe();
            System.out.println(player2.getName() + " flips:");
            card2.describe();

            int result = card1.getValue() - card2.getValue();
            if (result > 0) {
                player1.incrementScore();
                System.out.println(player1.getName() + " wins the round!");
            } else if (result < 0) {
                player2.incrementScore();
                System.out.println(player2.getName() + " wins the round!");
            } else {
                System.out.println("It's a tie!");
            }
        }

        int score1 = player1.getScore();
        int score2 = player2.getScore();

        System.out.println("Final Score:");
        System.out.println(player1.getName() + ": " + score1);
        System.out.println(player2.getName() + ": " + score2);

        if (score1 > score2) {
            System.out.println(player1.getName() + " wins!");
        } else if (score1 < score2) {
            System.out.println(player2.getName() + " wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}

