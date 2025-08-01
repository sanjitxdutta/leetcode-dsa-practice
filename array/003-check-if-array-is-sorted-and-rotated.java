// Problem link: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
// Time Complexity: O(N)
// Space Complexity: O(1)

class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            // Compare each element with the next (with wraparound using %)
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }

        return count <= 1;
    }
}
