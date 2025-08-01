// Problem link: 
// Time Complexity: O(N)
// Space Complexity: O(1)

class Solution {
    public int linearSearch(int[] arr, int target) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return i;  
            }
        }

        return -1;
    }
}
