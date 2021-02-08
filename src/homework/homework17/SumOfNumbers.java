package homework.homework17;

import java.util.Scanner;
import java.util.stream.Stream;

public class SumOfNumbers {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a series of numbers separated by commas: ");
        String[] numbers = scanner.next().split(",");
        Integer[] ints = Stream.of(numbers).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
        int sum = 0;
        for (Integer anInt : ints) {
            sum += anInt;
        }
        System.out.println("Sum = " + sum);
        inter(numbers);
    }

    public static void inter(String[] numbers) {
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
