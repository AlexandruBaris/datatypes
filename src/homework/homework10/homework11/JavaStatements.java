package homework.homework10.homework11;

import java.util.Arrays;
import java.util.Random;

public class JavaStatements {
    public static void main(String... args) {
        Random random = new Random();
        // A)
        int[] f = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(f[5]);

        // B)
        int[] g;
        g = new int[5];
        Arrays.fill(g, 8);

        //C
        double[] c;
        double total = 0;
        c = new double[100];
        for (int i = 0; i < c.length; i++) {
            total += c[i];
        }

        //D
        int[] a = new int[11];
        int[] b = new int[34];
        System.arraycopy(a, 0, b, 0, a.length);

        //E
        double[] w = new double[99];
        for (int i = 0; i < w.length; i++) {
            w[i] = random.nextDouble();
        }
        Arrays.sort(w);
        System.out.println(w[0] + " min value\n" + w[98] + " max value");
    }
}

