// Problem link:
// Time Complexity: O(N)  
// Space Complexity: O(1) 

class Solution {
    public int longestSubarrayWithSumK(int[] nums, int k) {
        int left = 0, right = 0;
        int n = nums.length;
        long sum = nums[0];
        int maxLen = 0;

        while (right < n) {
            // Shrink the window if sum exceeds k
            while (left <= right && sum > k) {
                sum -= nums[left];
                left++;
            }

            // Check if current window sum equals k
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Expand the window by moving right pointer
            right++;
            if (right < n) {
                sum += nums[right];
            }
        }

        return maxLen;
    }
}
