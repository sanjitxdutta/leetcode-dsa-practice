// Problem link: 
// Time Complexity: O(N)
// Space Complexity: O(1)

class Solution {
    public int largestElement(int [] arr) {
        int n = arr.length;
        int largest = arr[0];
        for(int i=1; i<n; i++){
            if(arr[i]>largest) largest = arr[i];
        }

        return largest;
    }
}