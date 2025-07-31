// Problem link: 
// Time Complexity:  O(N^2) 
// Space Complexity: O(1)

class Solution {
    public int[] insertionSort(int[] arr) {
        int n = arr.length; 

        for(int i=0; i<=n-1; i++){
            for(int j=i; j>0; j++){
                if(arr[j-1]>arr[j]){
                    swap(arr, j);
                }
            }
        }

        return arr;
    }

    public void swap(int[] arr, int j) {
        int temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;
    }
}
