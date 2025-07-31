// Problem link: 
// Time Complexity: O(N log N)
// Space Complexity: O(N) — only one temp array used

class Solution {
    public void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;

        int mid = low + (high - low) / 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);

        merge(arr, low, mid, high);
    }

    private void merge(int[] arr, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        // Compare elements and build temp array
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left++]);
            } else {
                temp.add(arr[right++]);
            }
        }

        // Copy remaining elements from left subarray
        while (left <= mid) {
            temp.add(arr[left++]);
        }

        // Copy remaining elements from right subarray
        while (right <= high) {
            temp.add(arr[right++]);
        }

        // Copy back to original array
        for (int i = 0; i < temp.size(); i++) {
            arr[low + i] = temp.get(i);
        }
    }
}
 