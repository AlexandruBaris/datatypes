package homework.homework9;

public class DivisibleNumbers {
    public static void calculator(int number, int line) {
        while (number <= 1000) {
            if (number % 5 == 0 || number % 6 == 0) {
                System.out.print(number + " ");
                line++;
            }
            if (line % 10 == 0) {
                System.out.println();
                line++;
            }
            number++;
        }
    }
}
