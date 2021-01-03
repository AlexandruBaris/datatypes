package homework6;

import java.util.Scanner;

public class PositiveNegativeNumbersCounter {
    public static void main(String[] args) {
        int count = 0, positive = 0, negative = 0;
        double total = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer, the input ends if it is 0: ");
        int number = input.nextInt();
        if (number == 0) {
            System.out.println("\nNo numbers are entered except 0");
            System.exit(1);
        }
        while (number != 0) {
            if (number > 0) positive++;
            else negative++;
            total += number;
            count++;
            number = input.nextInt();
        }
        double average = total / count;
        System.out.printf("\nThe number of positives is %d\nThe number of negatives is %d\nThe total is %2.1f\nThe average is %2.2f", positive, negative, total, average);
    }
}

