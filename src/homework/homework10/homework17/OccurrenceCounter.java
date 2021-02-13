package homework.homework10.homework17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OccurrenceCounter {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100: ");
        List<Integer> listOfNumbers = new ArrayList<>();

        boolean input = false;
        while (!input) {
            int number = scanner.nextInt();
            if (number != 0) {
                listOfNumbers.add(number);
            } else {
                input = true;
            }
        }

        for (int i = 0; i < 100; i++) {
            int occurrence = 0;
            if (listOfNumbers.contains(i)) {
                for (Integer number : listOfNumbers) {
                    if (number.equals(i))
                        occurrence++;
                }
            }
            if (occurrence > 1)
                System.out.println(i + " occurs " + occurrence + " times");
            else System.out.println(i + " occurs " + occurrence + " time");
        }
    }
}
