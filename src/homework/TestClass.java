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

    public class Veterinarian {
        public static void main(String[] args) {
            Veterinarian veterinarian = new Veterinarian();
            veterinarian.accept("Barkley");
            veterinarian.accept("Mittens");
            System.out.println(veterinarian.heal());
            System.out.println(veterinarian.heal());
        }

        public void accept(String petName) {
            throw new UnsupportedOperationException("Waiting to be implemented.");
        }

        public String heal() {
            throw new UnsupportedOperationException("Waiting to be implemented.");
        }
    }

}
