// Problem link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Time Complexity: O(N)
// Space Complexity: O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0;

        for(int j=1; j<n; j++){
            if(nums[i]!=nums[j]){
                nums[i+1] = nums[j];
                i++;
            }
        }

        return i+1;
    }
}
