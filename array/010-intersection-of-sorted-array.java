// Problem link: 
// Time Complexity: O(N + M)
// Space Complexity: O(1)

class Solution {
    public List<Integer> intersectionOfArrays(int[] a, int[] b) {
        int n1 = a.length;
        int n2 = b.length;
        int i = 0, j = 0;
        
        List<Integer> ansArr = new ArrayList<>();
        
        while(i<n1 && j<n2){
            if(a[i] < b[j]){
                i++;
            }
            else if(b[j] < a[i]){
                j++;
            }
            else {
                ansArr.add(a[i]);
                i++;
                j++;
            }
        }
        return ansArr;
    }
}
