package homework4;

import java.util.Scanner;

public class GradeCorisponder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter grade (A,B,C,D or F): ");
        char input = scanner.next().charAt(0);

        if (input == 'a' || input == 'A') {
            System.out.print("The numeric value for grade " + input + " is 4");
        } else if (input == 'b' || input == 'B') {
            System.out.println("The numeric value for grade " + input + " is 3");
        } else if (input == 'c' || input == 'C') {
            System.out.println("The numeric value for grade " + input + " is 2");
        } else if (input == 'd' || input == 'D') {
            System.out.println("The numeric value for grade " + input + " is 1");
        } else if (input == 'f' || input == 'F') {
            System.out.println("The numeric value for grade " + input + " is 0");
        } else {
            System.out.println(input + " is an invalid grade");
        }
    }
}

