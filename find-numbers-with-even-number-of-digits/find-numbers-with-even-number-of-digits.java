class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for(int num : nums) {
            int c = numberOfDigits(num);
            if(c % 2 == 0) ans++;
        }
        return ans;
    }
    
    // compute number of digits using mathematical formula
    public int numberOfDigits(int num) {
        return (int) Math.floor(Math.log10(num) + 1);
    }
}