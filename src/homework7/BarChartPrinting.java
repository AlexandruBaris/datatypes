package homework7;

import java.util.Scanner;

public class BarChartPrinting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0;
        int counter = 1, inputnumber;

        while (counter <= 5) {
            inputnumber = scanner.nextInt();
            if (inputnumber >= 1 && inputnumber <= 30) {
                switch (counter) {
                    case 1 -> num1 = inputnumber;
                    case 2 -> num2 = inputnumber;
                    case 3 -> num3 = inputnumber;
                    case 4 -> num4 = inputnumber;
                    case 5 -> num5 = inputnumber;
                }
                counter++;
            } else {
                System.out.print("Enter a number from 1 to 30: ");
            }
        }


    }
}
