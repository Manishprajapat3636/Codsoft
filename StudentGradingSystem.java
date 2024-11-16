import java.util.Scanner;
import java.util.HashMap;

public class StudentGradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> studentGrades = new HashMap<>();
        HashMap<String, Double> studentScores = new HashMap<>();

        while (true) {
            System.out.print("Enter student's name (or type 'done' to finish): ");
            String name = scanner.nextLine();
            if (name.toLowerCase().equals("done")) {
                break;
            }

            System.out.print("Enter score for " + name + ": ");
            double score = scanner.nextDouble();
            scanner.nextLine();

            String grade = getGrade(score);
            studentScores.put(name, score);
            studentGrades.put(name, grade);
        }

        System.out.println("\nStudent Grades:");
        for (String name : studentGrades.keySet()) {
            System.out.println(name + ": Score = " + studentScores.get(name) + ", Grade = " + studentGrades.get(name));
        }

        scanner.close();
    }

    public static String getGrade(double score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}

