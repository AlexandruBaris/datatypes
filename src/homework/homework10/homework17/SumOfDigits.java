package homework.homework10.homework17;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a series of single digit numbers with nothing separating them: ");
        String numbers = scanner.next();
        calculateSum(numbers);
    }

    private static void calculateSum(String numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length(); i++) {
            String temp = numbers.substring(i, i + 1);
            sum += Integer.parseInt(temp);
        }
        System.out.print(sum);
    }
}
