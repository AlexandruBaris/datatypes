package homework.homework1.homework8;


import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter one of the following choices:\na) Carnivore\tb) Pianist\nc) Tree\t\t\td) Game\nYour choice: ");
        String choice = scanner.nextLine();

        while (!choice.equals("a") && !choice.equals("b") && !choice.equals("c") && !choice.equals("d")) {
            System.out.print("Please enter (a,b,c or d): ");
            choice = scanner.next();
        }
        switch (choice) {
            case "a":
                System.out.println("The lion is a carnivore");
                break;
            case "b":
                System.out.println("Beethoven was a pianist");
                break;
            case "c":
                System.out.println("Sequoia is a tree");
                break;
            case "d":
                System.out.println("Chess is a game");
                break;

        }
    }
}
