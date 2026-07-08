import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("=== Rock Paper Scissors Game ===");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");

        int playerWins = 0, computerWins = 0, ties = 0;
        boolean playAgain = true;

        while (playAgain) {
            System.out.print("\nEnter your choice (1, 2, or 3): ");
            int playerChoice = sc.nextInt();

            if (playerChoice < 1 || playerChoice > 3) {
                System.out.println("Invalid choice! Please enter 1, 2, or 3.");
                continue;
            }

            int computerChoice = random.nextInt(3) + 1;
            String[] choices = {"", "Rock", "Paper", "Scissors"};

            System.out.println("You chose: " + choices[playerChoice]);
            System.out.println("Computer chose: " + choices[computerChoice]);

            if (playerChoice == computerChoice) {
                System.out.println("It's a TIE!");
                ties++;
            } else if ((playerChoice == 1 && computerChoice == 3) ||
                       (playerChoice == 2 && computerChoice == 1) ||
                       (playerChoice == 3 && computerChoice == 2)) {
                System.out.println("YOU WIN!");
                playerWins++;
            } else {
                System.out.println("COMPUTER WINS!");
                computerWins++;
            }

            System.out.print("Play again? (yes/no): ");
            String response = sc.next().toLowerCase();
            playAgain = response.equals("yes");
        }

        System.out.println("\n=== Final Statistics ===");
        System.out.println("Your Wins: " + playerWins);
        System.out.println("Computer Wins: " + computerWins);
        System.out.println("Ties: " + ties);

        sc.close();
    }
}
