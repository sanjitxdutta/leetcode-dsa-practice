// Problem link: https://leetcode.com/problems/valid-palindrome/
// Time Complexity: O(N)
// Space Complexity: O(1)  // Ignoring recursion stack

class Solution {
    public boolean isPalindrome(String s) {
        // Clean the string
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        return checkPalindrome(s, 0);
    }

    private boolean checkPalindrome(String s, int i) {
        int n = s.length();
        if (i >= n / 2) return true;

        if (s.charAt(i) != s.charAt(n - i - 1)) return false;

        return checkPalindrome(s, i + 1);
    }
}
