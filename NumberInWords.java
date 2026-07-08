import java.util.Scanner;

public class NumberInWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (0-9999): ");
        int num = sc.nextInt();

        if (num < 0 || num > 9999) {
            System.out.println("Invalid input! Please enter a number between 0 and 9999.");
        } else {
            System.out.println("In words: " + convertToWords(num));
        }

        sc.close();
    }

    public static String convertToWords(int num) {
        String[] ones = {
            "", "One", "Two", "Three", "Four", "Five",
            "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
            "Sixteen", "Seventeen", "Eighteen", "Nineteen"
        };

        String[] tens = {
            "", "", "Twenty", "Thirty", "Forty", "Fifty",
            "Sixty", "Seventy", "Eighty", "Ninety"
        };

        if (num == 0) {
            return "Zero";
        }

        String result = "";

        // Thousands
        if (num >= 1000) {
            result += ones[num / 1000] + " Thousand ";
            num %= 1000;
        }

        // Hundreds
        if (num >= 100) {
            result += ones[num / 100] + " Hundred ";
            num %= 100;
        }

        // Tens and Ones
        if (num >= 20) {
            result += tens[num / 10] + " ";
            num %= 10;
        }

        if (num > 0) {
            result += ones[num];
        }

        return result.trim();
    }
}