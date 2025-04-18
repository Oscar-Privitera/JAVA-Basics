package src.Array;

public class CountEvenOdd {
    public static void main(String[] args) {
        int[] numbers = { 5, 21, 38, 78, 17, 89, 7, 2, 10, 6, 5, 28 };
        int evenCount = 0;
        int oddCount = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers : " + oddCount);
    }
}
