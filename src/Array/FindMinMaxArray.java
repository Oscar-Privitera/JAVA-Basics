package src.Array;

public class FindMinMaxArray {
    public static void main(String[] args) {
        int[] numbers = { 5, 21, 38, 78, 17 };
        int minValue = numbers[0];
        int maxValue = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }

        System.out.println("Minimum value: " + minValue);
        System.out.println("Maximum value: " + maxValue);
    }
}
