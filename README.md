# WAR-Card-Game
Welcome to WAR, a Java-based rendition of the popular card game utilizing principles of object-oriented programming. This project brings the classic game of WAR to life in a digital format, providing an interactive and enjoyable gaming experience.

Project Description
WAR is a simple card game where players draw cards from a deck, and the player with the highest card wins. In case of a tie, a "war" occurs, leading to an exciting showdown until a winner emerges. This implementation replicates the rules and gameplay of the traditional card game.

Key Features
Interactive Gameplay: Enjoy an engaging gameplay experience as you compete against the computer in rounds of card drawing and wars.
Object-Oriented Design: Built using principles of object-oriented programming, ensuring maintainability and extensibility of the codebase.

Live Demo
https://drive.google.com/file/d/1STgVBhajyckPSMH7DJXEpFn-MVAjhcOv/view?usp=sharing

Technologies Used:
Java

Favorite Features:
Feature 1: Interactive Gameplay
The implementation of the game logic, allowing seamless interaction between the player and the computer, was a rewarding challenge. Handling card draws, comparisons, and resolving wars efficiently was a key accomplishment.

Feature 2: Object-Oriented Design
Employing a robust object-oriented approach enabled clean separation of concerns and facilitated future enhancements. Utilizing classes for cards, players, and the game itself streamlined the development process.

Code Snippets

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

Installation & Usage
To run the WAR card game on your system:
Install the Java Development Kit and use Eclipse IDE, the CMD, or any JRE.

Contributions to the project are welcome! If you'd like to contribute:

Submit bug reports, feature requests, or pull requests via Github @ajpopovich

For any inquiries or feedback, feel free to reach out:

Email: popovich2614@gmail.com
@ajpopovich on Instagram!
