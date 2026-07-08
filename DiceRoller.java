import java.util.Scanner;
import java.util.Random;

public class DiceRoller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("=== Dice Roller Game ===");
        System.out.print("How many times do you want to roll the dice? ");
        int rolls = sc.nextInt();

        int total = 0;
        int maxValue = 0;
        int minValue = 6;

        System.out.println("\nRolling " + rolls + " times:");
        for (int i = 1; i <= rolls; i++) {
            int diceValue = random.nextInt(6) + 1;
            System.out.println("Roll " + i + ": " + diceValue);
            total += diceValue;
            if (diceValue > maxValue) maxValue = diceValue;
            if (diceValue < minValue) minValue = diceValue;
        }

        System.out.println("\n=== Statistics ===");
        System.out.println("Total sum: " + total);
        System.out.println("Average: " + (double) total / rolls);
        System.out.println("Maximum value: " + maxValue);
        System.out.println("Minimum value: " + minValue);

        sc.close();
    }
}
