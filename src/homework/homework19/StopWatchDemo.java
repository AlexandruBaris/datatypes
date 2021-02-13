package homework.homework19;

public class StopWatchDemo {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        int[] randomArray = getArray();
        stopWatch.start();
        sortArray(randomArray);
        //Arrays.sort(randomArray);
        stopWatch.stop();

        System.out.print("Time to sort: " + stopWatch.getElapsedTime() / 1000 + " Seconds");

    }

    public static int[] getArray() {
        int[] array = new int[100000];
        for (int i : array) {
            array[i] = (int) (Math.random() * 100000);
        }
        return array;
    }

    public static void sortArray(int[] array) {
        int temp;
        for (int i : array) {
            for (int j : array) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
