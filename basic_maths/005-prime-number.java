// Problem link: 
// Time Complexity: O(√x)
// Space Complexity: O(1)

class Solution {
    public boolean isPrime(int x) {
        if (x <= 1) return false;  // 0, 1, and negatives are not prime
        if (x == 2) return true;   // 2 is the only even prime number
        if (x % 2 == 0) return false; // exclude other even numbers

        for (int i = 3; i * i <= X; i += 2) {
            if (x % i == 0) return false;
        }

        return true;
    }
}