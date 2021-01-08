package homework7;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to be multiplied and the range: ");
        int number = scanner.nextInt();
        int range = scanner.nextInt();
        for (int i = 1; i <= range; i++) {
            System.out.println(i + "x" + number + "=" + number * i);
        }
    }
}
