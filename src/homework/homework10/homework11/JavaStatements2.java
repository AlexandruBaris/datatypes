package homework.homework10.homework11;

import java.util.Scanner;

public class JavaStatements2 {
    public static void main(String... args) {
        //  a)
        int[][] t;
        t = new int[2][3];

        //  b)
        int rows = t.length;

        //  c)
        int columns = t[0].length;

        //  d)
        int elements = 0;
        for (int[] element : t) {
            for (int j = 0; j < element.length; j++) {
                elements++;
            }
        }
        System.out.println("Number of elements in array t is " + elements);

        //   e)
        for (int i = 0; i < t[1].length; i++) {
            System.out.print(t[1][i] + " ");
        }
        System.out.println();

        //   f)
        for (int[] item : t) {
            System.out.println(item[2]);
        }

        //  g )
        t[0][1] = 0;

        //  h)
        t[0][0] = 0;
        t[0][1] = 0;
        t[0][2] = 0;
        t[1][0] = 0;
        t[1][1] = 0;
        t[1][2] = 0;

        //  i)
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                t[i][j] = 0;
            }
        }

        //  j)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values for the elements of array t");
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                t[i][j] = scanner.nextInt();
            }
        }

        //  k)
        int minValue = t[0][0];
        for (int[] value : t) {
            for (int i : value) {
                if (i < minValue) {
                    minValue = i;
                }
            }
        }
        System.out.println("The smallest value in array t is " + minValue);

        // l)

        System.out.println("Elements of the first row are");
        for (int i = 0; i < t[0].length; i++) {
            System.out.printf("%5d", t[0][i]);
        }
        System.out.println();

        //  m)

        int total = 0;
        for (int[] ints : t) {
            total += ints[2];
        }

        // n )

        for (int[] ints : t) {
            System.out.println();
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
        }
    }
}
