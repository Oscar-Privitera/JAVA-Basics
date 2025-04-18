package src;

import java.util.Scanner;

public class StringsTraining {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String phrase = scanner.nextLine();

        System.out.println("Length: " + phrase.length());
        System.out.println("First character: " + phrase.charAt(0));
        System.out.println("Upper case: " + phrase.toUpperCase());
        System.out.println("Contains 'Java'? " + phrase.contains("Java"));

        if (phrase.length() >= 3) {
            System.out.println("Start: " + phrase.substring(0, 3));
        } else {
            System.out.println("Sentence is too short to extract 3 characters.");
        }

        scanner.close();
    }
}
