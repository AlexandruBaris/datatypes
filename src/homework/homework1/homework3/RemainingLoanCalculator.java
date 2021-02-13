package homework.homework1.homework3;

import java.util.Scanner;

public class RemainingLoanCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount of loan: ");
        double loan = scanner.nextDouble();
        System.out.print("Enter interest rate: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter monthly payment: ");
        double monthlyPayment = scanner.nextDouble();
        System.out.println();
        double monthlyRate = (rate * 0.01) / 12;
        double firstPayment = loan - monthlyPayment + monthlyRate * loan;
        double secondPayment = firstPayment - monthlyPayment + monthlyRate * firstPayment;
        double thirdPayment = secondPayment - monthlyPayment + monthlyRate * secondPayment;

        System.out.printf("%s%.2f\n%s%.2f\n%s%.2f", "Balance remaining after first payment: $", firstPayment, "Balance remaining after second payment: $", secondPayment, "Balance remaining after third payment: $", thirdPayment);
    }

}
