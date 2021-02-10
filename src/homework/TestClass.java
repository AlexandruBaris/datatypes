package homework;

public class TestClass {
    public static void main(String... args) {

        //String s = str("burger");
        // System.out.print(s);
    }

    public static Integer ster(String op, int v1, int v2) {
        return switch (op) {
            case "+" -> v1 + v2;
            case "-" -> v1 - v2;
            case "*" -> v1 * v2;
            case "/" -> v1 / v2;
            default -> 0;
        };
    }


}

