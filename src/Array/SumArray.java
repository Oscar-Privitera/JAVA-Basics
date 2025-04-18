package src.Array;

public class SumArray {
    public static void main(String[] args) {
        int[] numbers = { 5, 21, 38, 78, 17 };
        int totalSum = 0;

        for (int number : numbers) {
            totalSum += number;
        }

        System.out.println("Total sum: " + totalSum);
    }
}
