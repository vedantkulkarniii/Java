import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class WordGuessGame {
    public static void main(String[] args) {
        String[] words = {"java", "apple", "coffee", "planet", "music", "sunrise"};
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        char playAgain;

        System.out.println("=== Word Guess Game ===");

        do {
            String target = words[random.nextInt(words.length)];
            char[] display = new char[target.length()];
            Arrays.fill(display, '_');

            int wrongAttempts = 0;
            int maxWrongAttempts = 6;

            System.out.println("\nGuess the word!");

            while (wrongAttempts < maxWrongAttempts && new String(display).contains("_")) {
                System.out.println("Word: " + String.valueOf(display));
                System.out.print("Enter a letter: ");

                if (!sc.hasNext()) {
                    break;
                }

                char letter = sc.next().toLowerCase().charAt(0);

                if (target.indexOf(letter) >= 0) {
                    for (int i = 0; i < target.length(); i++) {
                        if (target.charAt(i) == letter) {
                            display[i] = letter;
                        }
                    }
                    System.out.println("Correct!");
                } else {
                    wrongAttempts++;
                    System.out.println("Wrong! Attempts left: " + (maxWrongAttempts - wrongAttempts));
                }
            }

            if (new String(display).equals(target)) {
                score++;
                System.out.println("You won! The word was: " + target);
            } else {
                System.out.println("You lost! The word was: " + target);
            }

            System.out.println("Score: " + score);
            System.out.print("Play again? (y/n): ");

            if (!sc.hasNext()) {
                break;
            }

            playAgain = sc.next().charAt(0);

        } while (playAgain == 'y' || playAgain == 'Y');

        System.out.println("\nThanks for playing!");
        sc.close();
    }
}
