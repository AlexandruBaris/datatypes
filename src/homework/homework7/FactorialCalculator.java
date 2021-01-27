package homework.homework7;

public class FactorialCalculator {
    public static void main(String[] args) {
        long factorial = 1, number = 20;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
            System.out.println(factorial);
        }
    }
}
