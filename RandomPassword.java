import java.util.Random;
import java.util.Scanner;

public class RandomPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the desired password length: ");
        int length = sc.nextInt();

        if (length < 4) {
            System.out.println("Password length should be at least 4 characters!");
        } else {
            String password = generatePassword(length);
            System.out.println("Generated Password: " + password);
        }

        sc.close();
    }

    public static String generatePassword(int length) {
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specialChars = "!@#$%^&*()_+-=[]{}|;:,.<>?";
        
        String allChars = uppercase + lowercase + digits + specialChars;
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            password.append(allChars.charAt(random.nextInt(allChars.length())));
        }

        return password.toString();
    }
}
