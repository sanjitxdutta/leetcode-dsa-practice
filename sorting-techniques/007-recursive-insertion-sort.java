// Problem link:
// Time Complexity: O(N^2)
// Space Complexity: O(N) — due to recursion stack

class Solution {
    public void insertionSort(int[] arr) {
        recursiveInsertionSort(arr, arr.length);
    }

    private void recursiveInsertionSort(int[] arr, int n) {
        // Base case
        if (n <= 1) return;

        // Sort first n-1 elements
        recursiveInsertionSort(arr, n - 1);

        // Insert the last element at its correct position
        int last = arr[n - 1];
        int j = n - 2;

        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }

        arr[j + 1] = last;
    }
}
