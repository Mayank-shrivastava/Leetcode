class Solution {
    public double myPow(double x, long n) {
        if(n < 0) {
            x = 1/x;
            n = -n;
        }
        if(n == 0) {
            return 1;
        }
        
        if(x == 1) {
            return 1;
        }
        
        if(n == 1) {
            return x;
        }
        double ans = 1;
        if(n % 2 == 0) {
            ans *= myPow(x*x,n/2);
        } else {
            ans *= x*myPow(x*x,n/2);
        }
        return ans;
    }
}