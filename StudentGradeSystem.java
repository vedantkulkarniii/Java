import java.util.Scanner;

public class StudentGradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();
        sc.nextLine();

        String[] names = new String[numStudents];
        double[] scores = new double[numStudents];

        // Input student data
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student " + (i + 1) + " name: ");
            names[i] = sc.nextLine();

            System.out.print("Enter score for " + names[i] + ": ");
            scores[i] = sc.nextDouble();
            sc.nextLine();
        }

        // Display results
        System.out.println("\n=== Student Grade Report ===");
        for (int i = 0; i < numStudents; i++) {
            String grade = getGrade(scores[i]);
            System.out.println(names[i] + ": " + scores[i] + " -> Grade: " + grade);
        }

        sc.close();
    }

    public static String getGrade(double score) {
        if (score >= 90) return "A";
        else if (score >= 80) return "B";
        else if (score >= 70) return "C";
        else if (score >= 60) return "D";
        else return "F";
    }
}
