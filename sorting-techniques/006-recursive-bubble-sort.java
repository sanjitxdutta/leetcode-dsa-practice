// Problem link: 
// Time Complexity: O(N^2)
// Space Complexity: O(N) — due to recursive stack

class Solution {
    public void bubbleSort(int[] arr) {
        bubbleSortRecursive(arr, arr.length);
    }

    private void bubbleSortRecursive(int[] arr, int n) {
        // Base case
        if (n == 1) return;

        // One pass of bubble sort
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                swap(arr, i, i + 1);
            }
        }

        // Recur for the remaining unsorted part
        bubbleSortRecursive(arr, n - 1);
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
