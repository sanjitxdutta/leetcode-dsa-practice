// Problem link: 
// Time Complexity: O(N + M)
// Space Complexity: O(N + M)

class Solution {
    public List<Integer> unionOfArrays(int[] a, int[] b) {
        int n1 = a.length;
        int n2 = b.length;
        int i = 0, j = 0;
        
        List<Integer> unionArr = new ArrayList<>();
        
        while (i < n1 && j < n2) {
            if (a[i] <= b[j]) {
                if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != a[i]) {
                    unionArr.add(a[i]);
                }
                i++;
            } else {
                if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != b[j]) {
                    unionArr.add(b[j]);
                }
                j++;
            }
        }
        
        while (i < n1) {
            if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != a[i]) {
                unionArr.add(a[i]);
            }
            i++;
        }
        
        while (j < n2) {
            if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != b[j]) {
                unionArr.add(b[j]);
            }
            j++;
        }
        
        return unionArr;
    }
}
