class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int cp = prices[0];
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] < cp) {
                cp = prices[i];
            } else {
                ans = Math.max(ans, prices[i] - cp);
            }
        }
        return ans;
    }
}