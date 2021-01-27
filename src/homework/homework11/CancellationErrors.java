package homework.homework11;

public class CancellationErrors {
    public static void main(String... args) {
        double sumLeftToRight = 0.0, sumRightToLeft = 0.0;

        for (double i = 1.0; i <= 500000.0; i++) {
            sumLeftToRight += 1 / i;
        }

        for (double i = 500000.0; i >= 1.0; i--) {
            sumRightToLeft += 1 / i;
        }
        System.out.println("Summation of series left to right: " + sumLeftToRight + "\n" +
                "Summation of series right to left: " + sumRightToLeft);
    }
}
