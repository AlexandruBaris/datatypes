package homework7;

import java.util.Scanner;

public class SmallestValueFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int integers = scanner.nextInt();
        int smallest = 0;
        for (int i = 1; i <= integers; i++) {
            System.out.print("Enter integers: ");
            int numbers = scanner.nextInt();
            if (i == 1) {
                smallest = numbers;
            } else if (numbers < smallest) {
                smallest = numbers;
            }
        }
        System.out.println("Smallest integer is: " + smallest);
    }
}
