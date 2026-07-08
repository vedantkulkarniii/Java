import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms in Fibonacci series: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number!");
        } else {
            System.out.println("Fibonacci Series up to " + n + " terms:");
            long a = 0, b = 1;
            
            for (int i = 0; i < n; i++) {
                System.out.print(a + " ");
                long temp = a + b;
                a = b;
                b = temp;
            }
            System.out.println();
        }

        sc.close();
    }
}
