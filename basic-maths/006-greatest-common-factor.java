// Problem link: 
// Time Complexity: O(logx(min(a, b)))
// Space Complexity: O(1)

// Euclidian algorithm for gcd:  gcd(a,b) = gcd(a-b, b) a>b
// Modified: gcd(a,b) = gcd(a%b, b) a>b

class Solution {
    public int GCD(int a, int b) {
        while(a>0 && b>0){
            if(a>b) a%=b;
            else b%=a;

            return (a == 0) ? b : a;
        }
    }
}