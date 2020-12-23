package homework4;

import java.util.Scanner;

public class ValueDetector {

    static int zero;
    static int positiveNumber;
    static int negativeNumber;

    public static void numbersCounter(int n) {
        if (n == 0) {
            zero += 1;
        } else if (n > 0) {
            positiveNumber += 1;
        } else {
            negativeNumber += 1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 5 numbers (Positive,zero or negative; Press Enter after each) : ");
        int n1, n2, n3, n4, n5;
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        n3 = scanner.nextInt();
        n4 = scanner.nextInt();
        n5 = scanner.nextInt();

        numbersCounter(n1);
        numbersCounter(n2);
        numbersCounter(n3);
        numbersCounter(n4);
        numbersCounter(n5);

        System.out.println(zero + " of zero\n" + positiveNumber + " positive number(s)\n" + negativeNumber + " negative number(s)");
    }
}
