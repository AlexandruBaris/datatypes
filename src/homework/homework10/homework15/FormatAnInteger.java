package homework.homework10.homework15;

public class FormatAnInteger {
    public static void main(String... args) {
        System.out.println(format(34, 4));
    }

    public static String format(int number, int width) {
        String formatted = number + "";
        if (formatted.length() < width) {
            for (int i = width - formatted.length(); i > 0; i--) {
                formatted = 0 + formatted;
            }
        }
        return formatted;
    }
}
