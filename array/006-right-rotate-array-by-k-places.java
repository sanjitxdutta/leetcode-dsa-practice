// Problem link: https://leetcode.com/problems/rotate-array/
// Time Complexity: O(N)
// Space Complexity: O(1)

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }

    private void reverse(int[] nums, int start, int end){
        while(start < end){ 
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
    
    /*
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;  // in case k > n
        if (k == 0) return;

        // Store last k elements
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }

        // Shift the first n-k elements to the right
        for (int i = n - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }

        // Copy temp into the beginning
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }
*/