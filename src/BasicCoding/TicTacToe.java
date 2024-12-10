package BasicCoding;

import java.util.Scanner;

public class TicTacToe {
    static char[] board = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}; // Game board
    static char currentPlayer = 'X'; // Start with player X

    public static void printBoard() {
        System.out.println(board[0] + "|" + board[1] + "|" + board[2]);
        System.out.println("-----");
        System.out.println(board[3] + "|" + board[4] + "|" + board[5]);
        System.out.println("-----");
        System.out.println(board[6] + "|" + board[7] + "|" + board[8]);
    }

    public static boolean checkWinner() {
        // Check rows, columns, and diagonals
        for (int i = 0; i < 3; i++) {
            if (board[i * 3] == currentPlayer && board[i * 3 + 1] == currentPlayer && board[i * 3 + 2] == currentPlayer)
                return true;
            if (board[i] == currentPlayer && board[i + 3] == currentPlayer && board[i + 6] == currentPlayer)
                return true;
        }
        if (board[0] == currentPlayer && board[4] == currentPlayer && board[8] == currentPlayer) return true;
        if (board[2] == currentPlayer && board[4] == currentPlayer && board[6] == currentPlayer) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int moveCount = 0;
        while (true) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", enter a position (1-9): ");
            int position = scanner.nextInt() - 1;
            if (position < 0 || position > 8 || board[position] != ' ') {
                System.out.println("Invalid position! Try again.");
                continue;
            }
            board[position] = currentPlayer;
            moveCount++;
            if (checkWinner()) {
                printBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            }
            if (moveCount == 9) {
                printBoard();
                System.out.println("It's a draw!");
                break;
            }

            if (currentPlayer == 'X') {
                currentPlayer = 'O';
            } else {
                currentPlayer = 'X';
            }

        }
        scanner.close();
    }
}
