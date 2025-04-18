package src.Array.Sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = { 5, 1, 4, 2, 8 };

        System.out.println("Before sort: " + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }

            System.out.println("Pass " + (i + 1) + ": " + Arrays.toString(numbers));
        }

        System.out.println("After sort: " + Arrays.toString(numbers));
    }
}
