package taskr.engine;

import java.util.Scanner;

public class TaskrEngine {

    public static void main(String[] args) {
        TaskrEngine start = new TaskrEngine(new Scanner(System.in));
        start.run();
    }

    public static final int VIEW_TODAY_TASKS = 1;
    public static final int VIEW_ALL_TASKS = 2;
    public static final int ADD_TASK = 3;
    public static final int UPDATE_TASK = 4;
    public static final int DElETE_TASK = 5;
    public static final int EXIT = 0;

    private final Scanner scanner;

    public TaskrEngine(Scanner scanner) {
        this.scanner = scanner;
    }

    public void run() {
        boolean mainMenuRunning = true;
        do {
            System.out.println("\t\t\t Taskr - Home\n" +
                    "[" + VIEW_TODAY_TASKS + "]" + " View today's tasks\n" +
                    "[" + VIEW_ALL_TASKS + "]" + " View all tasks\n" +
                    "[" + ADD_TASK + "]" + " Add task\n" +
                    "[" + UPDATE_TASK + "]" + " Update task\n" +
                    "[" + DElETE_TASK + "]" + " Delete task\n\n" +
                    "[" + EXIT + "]" + " Exit");
            int decision = scanner.nextInt();
            switch (decision) {
                case VIEW_TODAY_TASKS:

                case VIEW_ALL_TASKS:
                    ;
                case ADD_TASK:
                    ;
                case UPDATE_TASK:
                    ;
                case DElETE_TASK:
                    ;
                case EXIT:
                    System.out.print("Bye");
                    mainMenuRunning = false;
            }
        } while (mainMenuRunning);
    }
}
