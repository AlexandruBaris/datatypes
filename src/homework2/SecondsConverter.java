package homework2;

import java.util.Scanner;

public class SecondsConverter {
    public static final long HOURS_IN_DAY = 24;
    public static final long MINUTES_IN_AN_HOUR = 60;
    public static final long SECONDS_IN_A_MINUTE = 60;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of second: ");
        long input = scanner.nextLong();

        long days = input / (HOURS_IN_DAY * 3600);
        long hours = (input % (HOURS_IN_DAY * 3600)) / (MINUTES_IN_AN_HOUR * 60);
        long minutes = ((input % (HOURS_IN_DAY * 3600)) % (MINUTES_IN_AN_HOUR * 60)) / SECONDS_IN_A_MINUTE;
        long seconds = ((input % (HOURS_IN_DAY * 3600)) % (MINUTES_IN_AN_HOUR * 60)) % SECONDS_IN_A_MINUTE;

        System.out.println(input + " seconds = " + days + " days, " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
    }
}