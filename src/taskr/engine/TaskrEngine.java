package taskr.engine;

import taskr.domain.Task;
import taskr.domain.TaskPriority;
import taskr.repository.TaskRepository;
import taskr.service.TaskService;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
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

    private final TaskService taskService = new TaskService(new TaskRepository());

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
                    enterViewTodayTasksMenu();
                    break;
                case VIEW_ALL_TASKS:
                    enterViewAllTasksMenu();
                    break;
                case ADD_TASK:
                    enterAddTaskMenu();
                    break;
                case UPDATE_TASK:
                    enterUpdateTaskMenu();
                case DElETE_TASK:
                    enterDeleteTaskMenu();
                case EXIT:
                    System.out.print("Bye");
                    mainMenuRunning = false;
            }
        } while (mainMenuRunning);
    }

    private void enterViewTodayTasksMenu() {
        boolean innerMenuRunning = true;
        do {
            System.out.println("Taskr - View today`s tasks");
            List<Task> todayTasks = taskService.getForToday();
            System.out.println("Your tasks for today " + LocalDate.now() + " are:");
            for (Task todayTask : todayTasks) {
                System.out.println(todayTask);
            }
            System.out.println("[-1]  back");
            int innerSelectedOption = scanner.nextInt();
            if (innerSelectedOption == -1)
                innerMenuRunning = false;
        } while (innerMenuRunning);
    }

    private void enterViewAllTasksMenu() {
        boolean innerMenuRunning = true;
        do {
            System.out.println("Taskr - View all tasks");

            List<Task> allTasks = taskService.getForToday();
            System.out.println("All your tasks are:");
            for (Task allTask : allTasks) {
                System.out.println(allTask);
            }
            System.out.println("[-1]  back");
            int innerSelectedOption = scanner.nextInt();
            if (innerSelectedOption == -1)
                innerMenuRunning = false;
        } while (innerMenuRunning);
    }

    private void enterDeleteTaskMenu() {
        boolean innerMenuRunning = true;
        do {
            System.out.println("Taskr - Delete task");

            System.out.println("  Pick the task you want to delete : \n");
            List<Task> allTasks = taskService.getAll();
            for (int i = 0; i < allTasks.size(); i++) {
                System.out.println("  [" + i + "] " + allTasks.get(i));
            }
            System.out.println("\n  [-1] Back");

            int innerSelectedOption = scanner.nextInt();
            if (innerSelectedOption == -1)
                innerMenuRunning = false;
            else if (innerSelectedOption >= 0 && innerSelectedOption < allTasks.size()) {
                Task task = allTasks.get(innerSelectedOption);
                taskService.delete(task);
                System.out.println("  Task [" + innerSelectedOption + "] successfully deleted.");
            } else {
                System.out.println("  Wrong option... [" + innerSelectedOption + "]");
            }

        } while (innerMenuRunning);
    }

    private void enterAddTaskMenu() {
        boolean innerMenuRunning = true;
        do {
            System.out.println("Taskr - Add task");
            System.out.println("[1] Complete the form\n\n[-1] Back");

            int innerSelectedOption = scanner.nextInt();
            if (innerSelectedOption == -1)
                innerMenuRunning = false;
            else if (innerSelectedOption == 1) {
                scanner.nextLine();

                System.out.println("  Please complete the following form, leave empty for null :");

                System.out.print("   - Title : ");
                String title = scanner.nextLine();

                System.out.print("   - Description : ");
                String description = scanner.nextLine();

                System.out.print("   - Priority (HIGH/MEDIUM/LOW) : ");
                String stringPriority = scanner.nextLine();
                TaskPriority taskPriority = null;
                if (!stringPriority.trim().isEmpty())
                    taskPriority = TaskPriority.valueOf(stringPriority);

                System.out.print("   - Start date (yyyy-MM-dd) : ");
                String stringStartDate = scanner.nextLine();
                LocalDate startDate = null;
                if (!stringStartDate.trim().isEmpty())
                    startDate = LocalDate.parse(stringStartDate);

                System.out.print("   - End date (yyyy-MM-dd) : ");
                String stringEndDate = scanner.nextLine();
                LocalDate endDate = null;
                if (!stringEndDate.trim().isEmpty())
                    endDate = LocalDate.parse(stringEndDate);

                System.out.print("   - Tags (a, a1, a2 ... n): ");
                String stringTags = scanner.nextLine();
                List<String> tags = null;
                if (!stringTags.trim().isEmpty())
                    tags = Arrays.asList(stringTags.split(", "));

                Task task = new Task(title, description, tags, taskPriority, startDate, endDate);
                taskService.save(task);
                System.out.println("  Successfully saved : ");
                System.out.println(task);
            } else {
                System.out.println("  Wrong option... [" + innerSelectedOption + "]");
            }

        } while (innerMenuRunning);
    }

    private void enterUpdateTaskMenu() {
        boolean innerMenuRunning = true;
        do {
            System.out.println("Taskr - Update task");

            System.out.println("  Pick the task you want to update : \n");
            List<Task> allTasks = taskService.getAll();
            for (int i = 0; i < allTasks.size(); i++) {
                System.out.println("  [" + i + "] " + allTasks.get(i));
            }
            System.out.println("\n  [-1] Back");

            int innerSelectedOption = scanner.nextInt();
            if (innerSelectedOption == -1)
                innerMenuRunning = false;
            else if (innerSelectedOption >= 0 && innerSelectedOption < allTasks.size()) {
                scanner.nextLine();
                System.out.println("  Please complete the following form, leave empty if no change is required :");

                System.out.print("   - Title : ");
                String title = scanner.nextLine();

                System.out.print("   - Description : ");
                String description = scanner.nextLine();

                System.out.print("   - Priority (HIGH/MEDIUM/LOW) : ");
                String stringPriority = scanner.nextLine();
                TaskPriority taskPriority = null;
                if (!stringPriority.trim().isEmpty())
                    taskPriority = TaskPriority.valueOf(stringPriority);

                System.out.print("   - Start date (yyyy-MM-dd) : ");
                String stringStartDate = scanner.nextLine();
                LocalDate startDate = null;
                if (!stringStartDate.trim().isEmpty())
                    startDate = LocalDate.parse(stringStartDate);

                System.out.print("   - End date (yyyy-MM-dd) : ");
                String stringEndDate = scanner.nextLine();
                LocalDate endDate = null;
                if (!stringEndDate.trim().isEmpty())
                    endDate = LocalDate.parse(stringEndDate);

                System.out.print("   - Tags (a, a1, a2 ... n): ");
                String stringTags = scanner.nextLine();
                List<String> tags = null;
                if (!stringTags.trim().isEmpty())
                    tags = Arrays.asList(stringTags.split(", "));

                Task task = new Task(title, description, tags, taskPriority, startDate, endDate);
                task.setId(allTasks.get(innerSelectedOption).getId());

                taskService.save(task);
                System.out.println("  Successfully updated : ");
                System.out.println(task);

            } else {
                System.out.println("  Wrong option... [" + innerSelectedOption + "]");
            }

        } while (innerMenuRunning);
    }
}
