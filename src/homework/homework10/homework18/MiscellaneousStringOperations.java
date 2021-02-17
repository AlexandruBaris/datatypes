package homework.homework10.homework18;

public class MiscellaneousStringOperations {
    public static void main(String[] args) {
        String name = "asd";
        name.toUpperCase();


    }

    public static boolean betterThanAverage(int[] cla, int you) {
        int sum = 0;
        for (int i : cla) {
            sum += cla[i];
        }
        int avg = sum / cla.length;
        return avg < you;
    }
}
