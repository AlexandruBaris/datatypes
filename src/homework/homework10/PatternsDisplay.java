package homework.homework10;

public class PatternsDisplay {
    public static void patternA() {
        System.out.print("Pattern A");
        for (int i = 1; i <= 6; i++) {
            for (int k = 1; k < i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }

    public static void patternB() {
        System.out.println("Pattern B");
        for (int i = 6; i >= 1; i--) {
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }

    public static void patternC() {
        System.out.println("Pattern C");
        for (int i = 1; i <= 6; i++) {
            for (int k = 6; k >= 1; k--) {
                if (k > i) {
                    System.out.print(" ");
                } else {
                    System.out.print(k);
                }
            }
            System.out.println();
        }
    }

    public static void patternD() {
        System.out.println("Pattern D");
        for (int i = 6; i >= 1; i--) {
            for (int k = i; k <= 6; k++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}

