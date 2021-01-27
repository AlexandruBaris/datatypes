package homework.homework10;

public class DisplayCharacters {
    public static void printChars(char ch1, char ch2, int numberPerLine) {
        for (char i = ch1, counter = 1; i <= ch2; i++, counter++) {
            if (counter % numberPerLine == 0) {
                System.out.println(i);
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
