// Problem link: 
// Time Complexity: O(N log N) on average, O(N^2) worst case
// Space Complexity: O(log N) auxiliary (due to recursion stack)

class Solution {
    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array using Hoare’s partition scheme
            int pivotIndex = partition(arr, low, high);

            // Recursively sort left and right parts
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Hoare Partition: picks first element as pivot
    private int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (i <= high - 1 && arr[i] <= pivot) i++;
            while (j >= low + 1 && arr[j] > pivot) j--;

            if (i < j) swap(arr, i, j);
        }

        // Swap pivot into its correct position
        swap(arr, low, j);
        return j;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
