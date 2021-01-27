package homework.homework14;

import java.util.Scanner;

public class CheckPassword {
    private static final int MIN_LENGTH = 8;
    //private static final int MIN_DIGITS = 2;

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = scanner.next();
        System.out.println((validatingPassword(password) ? "Valid " : "Invalid ") + "Password");
    }

    private static boolean validatingPassword(String password) {
        return lengthValidation(password) && onlyLettersAndDigits(password) && hasTwoDigits(password) && upperCaseCheck(password);
    }

    private static boolean lengthValidation(String password) {
        return password.length() >= MIN_LENGTH;
    }

    private static boolean onlyLettersAndDigits(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean hasTwoDigits(String password) {
        int digits = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                digits++;
            }
            if (digits >= 2) {
                return true;
            }
        }
        return false;
    }

    private static boolean upperCaseCheck(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
