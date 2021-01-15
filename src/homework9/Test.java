package homework9;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        displayPattern(number);

    }

    public static void displayPattern(int n) {
        int space = n - 1;
        for (int r = 1; r <= n; r++) {
            for (int p = 0; p < space; p++) {
                System.out.print("  ");
            }
            for (int i = r; i > 0; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
            space--;
        }
    }
}

