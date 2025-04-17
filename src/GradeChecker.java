package src;

import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a grade between 0 and 20: ");
        int grade = scanner.nextInt();

        if (grade < 0 || grade > 20) {
            System.out.println("Invalid value");
        } else if (grade >= 16) {
            System.out.println("Excellent!");
        } else if (grade >= 14) {
            System.out.println("Very Good!");
        } else if (grade >= 12) {
            System.out.println("Good");
        } else if (grade >= 10) {
            System.out.println("OK");
        } else {
            System.out.println("Failed");
        }

        scanner.close();
    }
}
