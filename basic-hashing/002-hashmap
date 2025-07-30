// Problem link: 
// Time Complexity: O(N)
// Space Complexity: O(N)

import java.util.HashMap;
import java.util.Map;

class Solution {
    public void countFrequencies(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println("Element: " + entry.getKey() + " → Frequency: " + entry.getValue());
        }
    }
}
