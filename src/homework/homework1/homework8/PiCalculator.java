package homework.homework1.homework8;

public class PiCalculator {


    public static double getValue() {
        int repetition = 200000, odd = 1;
        double pi = 0;
        // for(int i = 1; i<= repetition; i++) alterativa de vazut valoare la 200000 de repetari;
        for (int i = 1; ; i++) {
            double currentStatus;
            if (i % 2 == 0) {
                currentStatus = (double) -4 / odd;
            } else {
                currentStatus = (double) 4 / odd;
            }
            odd += 2;
            pi += currentStatus;
            if (pi == Math.PI) {
                // System.out.printf(i + " %.5f", pi);
                break;
            }
        }
        return pi;
    }
}
