package homework.homework16;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReversedNumbers {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[10];
        System.out.print("Enter 10 integers separated by a space: ");
        String[] numbers = scanner.nextLine().split(" ");

        reverse(numbers);
    }

    private static void reverse(String[] numbers) {
        Collections.reverse(Arrays.asList(numbers));
        System.out.print(Arrays.asList(numbers));
    }


}

