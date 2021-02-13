package homework.homework1.homework3;

import java.util.Scanner;

public class AmountDivider {

    final static long TWENTY_BILLS = 20;
    final static long TEN_BILLS = 10;
    final static long FIVE_BILLS = 5;
    final static long ONE_BILL = 1;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a dollar amount: ");
        long amount = scanner.nextLong();

        long twenty = amount / TWENTY_BILLS;
        amount = amount - twenty * 20;
        long ten = amount / TEN_BILLS;
        amount = amount - ten * 10;
        long five = amount / FIVE_BILLS;
        amount = amount - five * 5;
        long one = amount / ONE_BILL;

        System.out.printf("\n$20 bills: %d\n", twenty);
        System.out.printf("$10 bills: %d\n", ten);
        System.out.printf(" $5 bills: %d\n", five);
        System.out.printf(" $1 bills: %d\n", one);
    }

}
