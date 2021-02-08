package homework.homework16;

import java.util.Scanner;

public class AssignGrades {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int students = scanner.nextInt();

        int[] scores = new int[students];
        int best = 0;
        char grade;
        System.out.print("Enter " + students + " scores: ");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
            if (scores[i] > best) {
                best = scores[i];
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= best - 10) {
                grade = 'A';
            } else if (scores[i] >= best - 20) {
                grade = 'B';
            } else if (scores[i] >= best - 30) {
                grade = 'C';
            } else if (scores[i] >= best - 40) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            result.append("Student ").append(i).append(" scores is ").append(scores[i]).append(" and grade is ").append(grade).append("\n");
        }

        System.out.print(result);
    }
}
