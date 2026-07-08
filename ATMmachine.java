import java.util.Scanner;

public class ATMmachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount to withdraw: ");
        int amount = sc.nextInt();

        if (amount % 50 != 0) {
            System.out.println("Invalid amount! Please enter amount in multiples of 50.");
        } else {
            int note500 = amount / 500;
            amount = amount % 500;

            int note200 = amount / 200;
            amount = amount % 200;

            int note100 = amount / 100;
            amount = amount % 100;

            int note50 = amount / 50;
            amount = amount % 50;

            System.out.println("500 notes = " + note500);
            System.out.println("200 notes = " + note200);
            System.out.println("100 notes = " + note100);
            System.out.println("50 notes = " + note50);
        }

        sc.close();
    }
}