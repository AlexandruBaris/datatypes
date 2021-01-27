package homework.homework13;

import java.util.Scanner;

public class MatrixDisplay {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        printing(n);
    }

    public static void printing(int n) {
        for (int rows = 0; rows < n; rows++) {
            for (int col = 0; col < n; col++) {
                System.out.print((int) (Math.random() * 2));
            }
            System.out.println();
        }
    }
}
