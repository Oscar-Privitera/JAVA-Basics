package src.Array;

public class IsPalindromeArray {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 1 };
        boolean isPalindrome = true;

        for (int i = 0; i < numbers.length / 2; i++) {
            int start = numbers[i];
            int end = numbers[numbers.length - 1 - i];

            if (start != end) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is the array a palindrome? " + isPalindrome);
    }
}
