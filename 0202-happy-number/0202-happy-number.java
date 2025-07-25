import java.util.HashSet;

class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();  // Hash table to store visited numbers

        while (n != 1) {
            if (seen.contains(n)) {
                return false;  // Loop detected, not a happy number
            }

            seen.add(n);  // Store current number in HashSet
            n = getDigitSquareSum(n);  // Calculate sum of squares of digits
        }

        return true;  // If we reach 1 → Happy number
    }

    // Helper method to calculate sum of squares of digits
    private static int getDigitSquareSum(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;  // Extract digit
            sum += digit * digit;  // Add square of digit
            num /= 10;             // Remove digit from number
        }
        return sum;
    }  // ← This closing brace was missing
}
