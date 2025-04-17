package src;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.print("Choose an operator (+, -, *, /, %): ");
        String operator = scanner.next();

        double result;

        if (operator.equals("+")) {
            result = a + b;
            System.out.println("Addition result: " + result);
        } else if (operator.equals("-")) {
            result = a - b;
            System.out.println("Subtraction result: " + result);
        } else if (operator.equals("*")) {
            result = a * b;
            System.out.println("Multiplication result: " + result);
        } else if (operator.equals("/")) {
            if (b == 0) {
                System.out.println("Error: Cannot divide by zero.");
            } else {
                result = (double) a / b;
                System.out.println("Division result: " + result);
            }
        } else if (operator.equals("%")) {
            result = a % b;
            System.out.println("Modulo result: " + result);
        } else {
            System.out.println("Invalid operator!");
        }

        scanner.close();
    }
}
