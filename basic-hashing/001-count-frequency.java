// Problem link: 
// Time Complexity: O(N)
// Space Complexity: O(maxElement)

class Solution {
    public int[] countFrequencies(int[] arr) {
        int max = 0;
        for (int num : arr) {
            if (num > max) max = num;
        }

        int[] hash = new int[max + 1];

        for (int num : arr) {
            hash[num]++;
        }

        return hash;
    }
}

/*
// Problem link:
// Time Complexity: O(N)
// Space Complexity: O(1) // Only 26 letters

class Solution {
    public int[] countCharFreqLowercase(String str) {
        int[] freq = new int[26];  // For a to z

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a';  // Manual mapping
                freq[index]++;
            }
        }

        return freq;
    }
}
 */