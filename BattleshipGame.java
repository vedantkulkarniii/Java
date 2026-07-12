import java.util.Random;
import java.util.Scanner;

public class BattleshipGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        final int SIZE = 5;
        char[][] board = new char[SIZE][SIZE];
        boolean[][] ships = new boolean[SIZE][SIZE];

        // Initialize board
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = '-';
            }
        }

        // Place 5 ships randomly
        int placed = 0;
        while (placed < 5) {
            int row = random.nextInt(SIZE);
            int col = random.nextInt(SIZE);

            if (!ships[row][col]) {
                ships[row][col] = true;
                placed++;
            }
        }

        int attempts = 10;
        int hits = 0;

        System.out.println("=================================");
        System.out.println("      BATTLESHIP GAME");
        System.out.println("=================================");
        System.out.println("Board Size : 5 x 5");
        System.out.println("Hidden Ships : 5");
        System.out.println("Attempts : 10");
        System.out.println();

        while (attempts > 0 && hits < 5) {

            // Display Board
            System.out.println("\nCurrent Board:");

            System.out.print("  ");
            for (int i = 0; i < SIZE; i++)
                System.out.print(i + " ");

            System.out.println();

            for (int i = 0; i < SIZE; i++) {
                System.out.print(i + " ");
                for (int j = 0; j < SIZE; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("\nAttempts Left : " + attempts);

            System.out.print("Enter Row (0-4): ");
            int row = sc.nextInt();

            System.out.print("Enter Column (0-4): ");
            int col = sc.nextInt();

            if (row < 0 || row >= SIZE || col < 0 || col >= SIZE) {
                System.out.println("Invalid Position!");
                continue;
            }

            if (board[row][col] == 'X' || board[row][col] == 'O') {
                System.out.println("Already Tried!");
                continue;
            }

            if (ships[row][col]) {
                board[row][col] = 'X';
                hits++;
                System.out.println("💥 HIT!");
            } else {
                board[row][col] = 'O';
                System.out.println("🌊 MISS!");
            }

            attempts--;
        }

        System.out.println("\n=========================");
        System.out.println("GAME OVER");
        System.out.println("=========================");

        if (hits == 5) {
            System.out.println("🎉 Congratulations! You Sank All Ships!");
        } else {
            System.out.println("Better Luck Next Time!");
        }

        System.out.println("Ships Destroyed : " + hits + "/5");

        // Reveal Ships
        System.out.println("\nFinal Board:");

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {

                if (ships[i][j] && board[i][j] == '-') {
                    board[i][j] = 'S';
                }

                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}