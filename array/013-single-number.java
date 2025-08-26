// Problem link: https://leetcode.com/problems/single-number/
// Time Complexity: O(N)
// Space Complexity: O(1)

class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int xor = 0;

        for(int i=0; i<n; i++){
            xor = xor ^ nums[i];
        }

        return xor;
    }
}
