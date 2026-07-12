import java.util.ArrayList;
import java.util.Scanner;

public class TodoListManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        ArrayList<Boolean> completed = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n========== TO-DO LIST MANAGER ==========");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Remove Task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter task: ");
                    String task = sc.nextLine();

                    tasks.add(task);
                    completed.add(false);

                    System.out.println("✅ Task Added Successfully!");
                    break;

                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        System.out.println("\n------ YOUR TASKS ------");

                        for (int i = 0; i < tasks.size(); i++) {

                            String status = completed.get(i) ? "[✓]" : "[ ]";

                            System.out.println((i + 1) + ". " + status + " " + tasks.get(i));
                        }
                    }
                    break;

                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                        break;
                    }

                    System.out.print("Enter task number to mark completed: ");
                    int complete = sc.nextInt();

                    if (complete >= 1 && complete <= tasks.size()) {
                        completed.set(complete - 1, true);
                        System.out.println("🎉 Task Completed!");
                    } else {
                        System.out.println("Invalid Task Number!");
                    }

                    break;

                case 4:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                        break;
                    }

                    System.out.print("Enter task number to remove: ");
                    int remove = sc.nextInt();

                    if (remove >= 1 && remove <= tasks.size()) {
                        tasks.remove(remove - 1);
                        completed.remove(remove - 1);

                        System.out.println("🗑️ Task Removed!");
                    } else {
                        System.out.println("Invalid Task Number!");
                    }

                    break;

                case 5:
                    System.out.println("\nThank you for using To-Do List Manager!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}