// Problem link: 
// Time Complexity: O(√x)
// Space Complexity: O(1)

class Solution {
    public int divisors(int x) {
        if (x <= 0) return 0;

        int count = 0;
        for (int i = 1; i * i <= x; i++) {
            if (x % i == 0) {
                if (i == x / i) {
                    count += 1;  // perfect square
                } else {
                    count += 2;  // i and x/i are distinct
                }
            }
        }
        return count;
    }
}

/*Finds all its positive divisors
Stores them in a List<Integer>
Returns the list sorted in ascending order

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<Integer> getDivisors(int x) {
        List<Integer> divisors = new ArrayList<>();
        if (x <= 0) return divisors; // No divisors for 0 or negative numbers

        for (int i = 1; i * i <= x; i++) {
            if (x % i == 0) {
                divisors.add(i);
                if (i != x / i) {
                    divisors.add(x / i);
                }
            }
        }

        Collections.sort(divisors);  // Sort the list
        return divisors;
    }
}*/
