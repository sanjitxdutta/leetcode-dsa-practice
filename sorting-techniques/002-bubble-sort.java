// Problem link: 
// Time Complexity:  O(N^2) in worst case, O(N) in best case (when array is sorted)
// Space Complexity: O(1)

class Solution {
    public int[] bubbleSort(int[] arr) {
        int n = arr.length; 

        for (int i = n - 1; i >= 1; i--) {
            boolean did_swap = false; // reset before each pass
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j);
                    did_swap = true;
                }
            }
            // If no swaps happened, the array is already sorted
            if (!did_swap) break;
        }

        return arr;
    }

    public void swap(int[] arr, int j) {
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
    }
}
