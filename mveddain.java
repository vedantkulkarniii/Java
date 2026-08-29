import java.util.Scanner;

public class mveddain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your name");
        String name = sc.nextLine();

        System.out.println("Enter you age ");
        int age = sc.nextInt();

        System.out.println("Your name is " + name);
        System.out.println("and age is " + age);
    }
}