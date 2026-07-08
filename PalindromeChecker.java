import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to check if it's a palindrome: ");
        String str = sc.nextLine();

        String original = str.toLowerCase().replaceAll("\\s+", "");
        String reversed = new StringBuilder(original).reverse().toString();

        if (original.equals(reversed)) {
            System.out.println("\"" + str + "\" is a PALINDROME!");
        } else {
            System.out.println("\"" + str + "\" is NOT a palindrome.");
        }

        sc.close();
    }
}
