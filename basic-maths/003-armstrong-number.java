// Problem link: https://leetcode.com/problems/armstrong-number/
// Time Complexity: O(log10(N))
// Space Complexity: O(1)

class Solution {
    public boolean isArmstrong(int x) {
        if (x < 0) return false;
        
        int n = countDigits(x);  // Step 1
        int sum = 0;
        int duplicate = x;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            sum += Math.pow(digit, n);  // Step 2 and 3
        }

        return sum == duplicate;
    }

    private int countDigits(int x) {
        int count = 0;
        while (x != 0) {
            x /= 10;
            count++;
        }
        return count == 0 ? 1 : count;  // to handle 0
    }
}
