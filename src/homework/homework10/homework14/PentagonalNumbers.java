package homework.homework10.homework14;

public class PentagonalNumbers {
    private static final int TOTAL_NUMBERS = 100;
    private static final int NUMBERS_PER_LINE = 10;

    public static void main(String... args) {
        for (int i = 1; i <= TOTAL_NUMBERS; i++) {
            System.out.print(getPentagonalNumber(i) + " ");
            if (i % NUMBERS_PER_LINE == 0) System.out.println();
        }
    }

    private static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }
}
