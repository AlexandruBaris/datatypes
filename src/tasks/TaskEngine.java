package tasks;

import java.util.Scanner;

public class TaskEngine {

    public static Scanner scanner = new Scanner(System.in);

    public static void run() {
        int decision;
        do {
            System.out.println("Tasker - home\n" +
                    "[1] View today's tasks \n" +
                    "[2] View all tasks \n" +
                    "[3] Add task \n" +
                    "[4] Update task \n" +
                    "[5] Delete task \n\n" +
                    "[0] Exit >|  ");
            decision = scanner.nextInt();
            switch (decision) {
                case 1 -> viewTodayTasks();
                case 2 -> viewAllTasks();
                case 3 -> addTask();
            }
        } while (decision != 0);
    }

    public static void viewTodayTasks() {
        System.out.println("Tasker - View Today's tasks");
        System.out.println("TASKS");

        System.out.print("[0] - Back >|");
        int decision = scanner.nextInt();
        if (decision == 0) {
            run();
        } else viewTodayTasks();
    }

    public static void viewAllTasks() {
        System.out.println("Tasker - View all tasks");

        System.out.print("[0] - Back >| ");
        int decision = scanner.nextInt();
        if (decision == 0) {
            run();
        } else viewTodayTasks();
    }

    public static void addTask() {
        System.out.print("Tasker - Add task\n[1] Complete the form\n[0] Back >|");
        int response = scanner.nextInt();
        if (response == 0) {
            run();
        } else if (response == 1) {
            System.out.println("Please complete the following form, leave empty for null:");
            System.out.println("- Title : ");
            String title = scanner.next();
            System.out.println("- Description : ");
            String description = scanner.next();
            System.out.println("- Start date : ");
            String startDate = scanner.next();
            System.out.println("- End date : ");
            String endDate = scanner.next();
            System.out.println("- Tags : ");
            String tags = scanner.next();
            Task newTask = new Task(title, description, startDate, endDate, tags);
            //addTask(newTask);


        }
    }
}
