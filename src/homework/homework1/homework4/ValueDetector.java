package homework.homework1.homework4;

import java.util.Scanner;

public class ValueDetector {

    static int numberOfZeros;
    static int numberOfPoistives;
    static int numberOfNegatives;

    public static void checkNumber(int n) {
        if (n == 0) {
            numberOfZeros += 1;
        } else if (n > 0) {
            numberOfPoistives += 1;
        } else {
            numberOfNegatives += 1;
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

        checkNumber(n1);
        checkNumber(n2);
        checkNumber(n3);
        checkNumber(n4);
        checkNumber(n5);

        System.out.println(numberOfZeros + " of zero\n" + numberOfPoistives + " positive number(s)\n" + numberOfNegatives + " negative number(s)");
    }
}
