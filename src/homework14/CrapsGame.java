package homework14;

import java.util.Random;

public class CrapsGame {
    public static void main(String... args) {
        Random random = new Random();
        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;
        int sum = dice1 + dice2;
        System.out.printf("You rolled %d + %d = %d\n", dice1, dice2, sum);
        switch (sum) {
            case 2, 3, 12 -> System.out.println("You lose");
            case 7, 11 -> System.out.println("You win");
            case 4, 5, 6, 8, 9, 10 -> {
                System.out.println("Point is: " + sum);
                isPoint();
            }
        }
    }

    public static void isPoint() {
        Random random = new Random();
        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;
        int sum2 = dice1 + dice2;
        switch (sum2) {
            case 7, 2, 3, 12 -> System.out.printf("You rolled %d + %d = %d \nYou lose", dice1, dice2, sum2);
            case 4, 5, 6, 8, 9, 10, 11 -> System.out.printf("You rolled %d + %d = %d \nYou win", dice1, dice2, sum2);
        }
    }
}
