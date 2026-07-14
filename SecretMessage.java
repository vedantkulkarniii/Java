import java.util.Scanner;

public class SecretMessage {

    public static String encrypt(String text, int key) {
        StringBuilder result = new StringBuilder();

        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                ch = (char) ((ch - base + key) % 26 + base);
            }
            result.append(ch);
        }
        return result.toString();
    }

    public static String decrypt(String text, int key) {
        return encrypt(text, 26 - key);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== SECRET MESSAGE =====");
            System.out.println("1. Encrypt Message");
            System.out.println("2. Decrypt Message");
            System.out.println("3. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 3) {
                System.out.println("Goodbye!");
                break;
            }

            System.out.print("Enter Message: ");
            String message = sc.nextLine();

            System.out.print("Enter Secret Key (1-25): ");
            int key = sc.nextInt();

            if (choice == 1) {
                System.out.println("Encrypted Message: " + encrypt(message, key));
            } else if (choice == 2) {
                System.out.println("Decrypted Message: " + decrypt(message, key));
            } else {
                System.out.println("Invalid Choice!");
            }
        }

        sc.close();
    }
}