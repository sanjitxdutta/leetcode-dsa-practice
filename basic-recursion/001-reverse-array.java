// Problem link: 
// Time Complexity: O(N)
// Space Complexity: O(1)  // If we ignore recursion call stack

class Solution {
    public void reverseArray(int arr[]) {
        reverse(arr, 0);  // Start from index 0
    }

    private void reverse(int[] arr, int i) {
        int n = arr.length;
        if (i >= n / 2) return;

        // Swap arr[i] and arr[n - i - 1]
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;

        // Recursive call for next index
        reverse(arr, i + 1);
    }
}
/* 
class Solution {
    public void reverseArray(int arr[]) {
        reverse(arr, 0, arr.length - 1);
    }

    private void reverse(int[] arr, int left, int right) {
        if (left >= right) return;

        // Swap
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        // Recursive call
        reverse(arr, left + 1, right - 1);
    }
}
*/