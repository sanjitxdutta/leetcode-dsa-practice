// Problem link: https://leetcode.com/problems/palindrome-number/
// Time Complexity: O(log10(N))
// Space Complexity: O(1)

class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int rev = 0;
        int duplicate = x;
        while(x != 0) {
            int digit = x % 10 ;
            x = x / 10;
            rev = rev * 10 + digit;
        }
        return rev == duplicate;
    }
}