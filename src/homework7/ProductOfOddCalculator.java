package homework7;

public class ProductOfOddCalculator {
    public static void main(String[] args) {

        int product = 1;
        for (int i = 1; i <= 15; i++) {
            if (i % 2 != 0) {
                product = product * i;
            }
        }
        System.out.println("The product of Odd Integers from 1 to 15 is: " + product);
    }
}
