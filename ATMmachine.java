import java.util.Scanner;

public class ATMmachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount to withdraw: ");
        int button = sc.nextInt();

        switch (button){
            case 1: System.out.println("Helloo");
            break;
            case 2: System.out.println("Namastee");
            break;
            case 3 : System.out.println("Bonjur");
            break;
            default: System.out.println("Invalid button");
        }


    }
}