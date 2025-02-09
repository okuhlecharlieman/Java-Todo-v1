import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private static List<String> tasks = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Welcome to the To-Do App!");
        
        do {
            System.out.println("\nChoose an option: ");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Exit");
            System.out.print("Enter command: ");
            command = scanner.nextLine();

            switch (command) {
                case "1":
                    System.out.print("Enter task: ");
                    String task = scanner.nextLine();
                    addTask(task);
                    break;
                case "2":
                    viewTasks();
                    break;
                case "3":
                    System.out.println("Exiting the application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid command. Please try again.");
            }
        } while (!command.equals("3"));

        scanner.close();
    }

    private static void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

    private static void viewTasks() {
        System.out.println("\nYour tasks:");
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }
}