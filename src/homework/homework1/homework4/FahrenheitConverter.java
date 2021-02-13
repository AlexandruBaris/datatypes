package homework.homework1.homework4;

import java.util.Scanner;

public class FahrenheitConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");
        double celsius = scanner.nextDouble();

        System.out.printf("%.2f Celsius is %.2f Fahrenheit", celsius, ((9.0 / 5) * celsius + 32));

    }
}
