package homework.homework10.homework11;

public class HeadsOrTails {
    public static void main(String... args) {
        int heads = 0, tails = 0, coin;
        for (int i = 0; i < 1000000; i++) {
            coin = (int) (Math.random() * 2) == 0 ? heads++ : tails++;
        }
        System.out.println("Heads: " + heads + "\nTails: " + tails);
    }
}
