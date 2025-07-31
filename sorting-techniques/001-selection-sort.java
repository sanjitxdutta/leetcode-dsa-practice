// Problem link: 
// Time Complexity: O(N^2)      
// Space Complexity: O(1)    

class Solution {
    public int[] selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <= n - 2; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            swap(arr, i, min_index);
        }
        return arr;
    }

    public void swap(int[] arr, int i, int min_index) {
        int temp = arr[i];
        arr[i] = arr[min_index];
        arr[min_index] = temp;
    }
}
