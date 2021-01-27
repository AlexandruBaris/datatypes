package homework.homework8;

import java.util.Scanner;

public class HighestScoreFinder {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        String topStudent = "";
        double topScore = 0;
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print((i + 1) + ".Student Name: ");
            String name = scanner.next();
            System.out.print("Enter score: ");
            double score = scanner.nextDouble();
            if (score > topScore) {
                topScore = score;
                topStudent = name.toUpperCase();
            }
        }
        System.out.print(topStudent + " is the student with the highest score.");
    }
}
