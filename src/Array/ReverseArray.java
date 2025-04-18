package src.Array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6 };

        for (int i = 0; i < numbers.length / 2; i++) {
            int oppositeIndex = numbers.length - 1 - i;

            int temp = numbers[i];
            numbers[i] = numbers[oppositeIndex];
            numbers[oppositeIndex] = temp;
        }

        System.out.println("Reversed array:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
