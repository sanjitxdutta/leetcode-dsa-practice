// Problem link: https://leetcode.com/problems/frequency-of-the-most-frequent-element/
// Time Complexity: O(N log N)
// Space Complexity: O(1)

import java.util.Arrays;

class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        long total = 0;
        int left = 0, res = 0;

        for (int right = 0; right < nums.length; right++) {
            total += nums[right];

            // Total cost to make all elements in window equal to nums[right]
            while ((long) nums[right] * (right - left + 1) - total > k) {
                total -= nums[left];
                left++;
            }

            res = Math.max(res, right - left + 1);
        }

        return res;
    }
}
}
