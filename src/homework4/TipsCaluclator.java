package homework4;

import java.util.Scanner;

public class TipsCaluclator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the subtotal and  a gratuity rate: ");
        double subtotal = scanner.nextDouble();
        double gratuity = scanner.nextDouble();

        double newGratuity = subtotal * gratuity / 100;

        System.out.println("The gratuity is $" + newGratuity + " and total is $" + (subtotal + newGratuity));
    }
}
