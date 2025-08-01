// Problem link: 
// Time Complexity: O(N)
// Space Complexity: O(1)

class Solution {
    public int secondLargestElement(int [] arr) {
        int n = arr.length;
        if (n < 2) return -1;

        int largest = arr[0];
        int secondLargest = -1;
        
        for(int i=1; i<n; i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }
}