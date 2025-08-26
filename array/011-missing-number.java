// Problem link: https://leetcode.com/problems/missing-number/
// Time Complexity: O(N)
// Space Complexity: O(1)

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xor1=0, xor2=0;

        for(int i=0; i<n; i++){
            xor2 = xor2 ^ nums[i];
            xor1 = xor1 ^ (i+1);
        }
        
        return (xor2 ^ xor1);
    }
}
