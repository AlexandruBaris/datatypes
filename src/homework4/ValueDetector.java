package homework4;

import java.util.Scanner;

public class ValueDetector {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 5 numbers (Press Enter after each) : ");
        int n1, n2, n3, n4, n5;
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        n3 = scanner.nextInt();
        n4 = scanner.nextInt();
        n5 = scanner.nextInt();

        if (n1 > 0) {
            System.out.println(n1 + " - is positive");
        } else if (n1 == 0) {
            System.out.println(n1 + " - zero");
        } else {
            System.out.println(n1 + " - is negative");
        }

        if (n2 > 0) {
            System.out.println(n2 + " - is positive");
        } else if (n2 == 0) {
            System.out.println(n2 + " - zero");
        } else {
            System.out.println(n2 + " - is negative");
        }

        if (n3 > 0) {
            System.out.println(n3 + " - is positive");
        } else if (n3 == 0) {
            System.out.println(n3 + " - zero");
        } else {
            System.out.println(n3 + " - is negative");
        }

        if (n4 > 0) {
            System.out.println(n4 + " - is positive");
        } else if (n4 == 0) {
            System.out.println(n4 + " - zero");
        } else {
            System.out.println(n4 + " - is negative");
        }

        if (n5 > 0) {
            System.out.println(n5 + " - is positive");
        } else if (n5 == 0) {
            System.out.println(n5 + " - zero");
        } else {
            System.out.println(n5 + " - is negative");
        }

    }
}
