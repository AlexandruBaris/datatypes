package homework.homework10.homework17;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a series of numbers separated by commas: ");
        String[] numbers = scanner.next().split(",");

        calculateSumOfDigits(numbers);
    }

    public static void calculateSumOfDigits(String[] numbers) {
        Integer[] array = new Integer[numbers.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(numbers[i]);
        }
        int sum = 0;
        for (Integer anInt : array) {
            sum += anInt;
        }
        System.out.print("Sum = " + sum);
    }
}
