package BasicCoding;

import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int player1 = 0, player2 = 0; // Player positions
        int target = 100; // Winning position
        Random random = new Random();

        while (player1 < target && player2 < target) {
            // Player 1's turn
            int roll = random.nextInt(6) + 1;
            player1 += roll;
            System.out.println("Player 1 rolls a " + roll + " and moves to " + player1);
            if (player1 == 100) {
                System.out.println("Player 1 wins!");
                break;
            } else if (player1 > target) {
                player1 = 100 - (player1 - 100); // Handle overshooting
            }

            // Player 2's turn
            roll = random.nextInt(6) + 1;
            player2 += roll;
            System.out.println("Player 2 rolls a " + roll + " and moves to " + player2);
            if (player2 == 100) {
                System.out.println("Player 2 wins!");
                break;
            } else if (player2 > target) {
                player2 = 100 - (player2 - 100); // Handle overshooting
            }
        }
    }
}
