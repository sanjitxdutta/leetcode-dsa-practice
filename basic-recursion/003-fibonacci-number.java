// Problem link: https://leetcode.com/problems/fibonacci-number/
// Time Complexity: O(N)
// Space Complexity: O(1)  // Recursion stack depth

class Solution {
    public int fib(int n) {
        int prev2 = 0;
        int prev = 1;

        int curr = 0;

        for(int i = 2; i <= n; i++) {
            curr = prev + prev2;
            prev2 = prev;
            prev = curr;
        }

        return (n<=1)? n : curr;
    }
}

/*
// Time Complexity: O(2^N)
// Space Complexity: O(N)  // Recursion stack depth

class Solution {
    public int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
}
*/