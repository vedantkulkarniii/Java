import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        char playAgain;

        System.out.println("=== Welcome to Number Guessing Game ===");

        do {
            int numberToGuess = random.nextInt(100) + 1;
            int guess = 0;
            int attempts = 0;
            int maxAttempts = 7;

            System.out.println("\nI have selected a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts to guess it!");

            while (guess != numberToGuess && attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attempts++;

                if (guess > numberToGuess) {
                    System.out.println("Too High!");
                } else if (guess < numberToGuess) {
                    System.out.println("Too Low!");
                } else {
                    System.out.println("Correct! You guessed the number in " + attempts + " attempts.");
                    score += (maxAttempts - attempts + 1) * 10;
                }
            }

            if (guess != numberToGuess) {
                System.out.println("Out of attempts! The correct number was: " + numberToGuess);
            }

            System.out.println("Your current score: " + score);

            System.out.print("Do you want to play again? (y/n): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'y' || playAgain == 'Y');

        System.out.println("\nThanks for playing!");
        System.out.println("Final Score: " + score);

        sc.close();
    }
}