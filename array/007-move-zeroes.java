// Problem link: https://leetcode.com/problems/move-zeroes/
// Time Complexity: O(N)
// Space Complexity: O(1)

class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = -1;

        // Step 1: Find the first 0
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        // If no zero was found, no need to do anything
        if (j == -1) return;

        // Step 2: Move non-zero elements to the left of zeroes
        for (int i = j + 1; i < n; i++) {
            if (nums[i] != 0) {
                swap(nums, i, j);
                j++;
            }
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
