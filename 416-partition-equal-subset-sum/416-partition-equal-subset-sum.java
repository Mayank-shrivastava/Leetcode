class Solution {
    public boolean canPartition(int[] nums) {
        // memoized version
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if(sum % 2 != 0) {
            return false;    //odd sum can't be divided into equal parts
        } else {
            /*
              if sum/2 exist in the subset of nums then we can equally
              partition the array into two subsets of equal sum
            */
            Boolean[][] dp = new Boolean[nums.length+1][sum/2 + 1];
            return isSubsetSum(nums,nums.length, sum/2, dp);
        }
    }
    
    public boolean isSubsetSum(int[] nums, int n, int sum, Boolean[][] dp) {
        if(sum == 0) {
            return true;
        }
        
        if(n == 0) {
            return false;
        }
        
        if(dp[n][sum] != null) {
            return dp[n][sum];
        }
        
        if(nums[n-1] <= sum) {
            return dp[n][sum] = isSubsetSum(nums,n-1, sum-nums[n-1], dp) || isSubsetSum(nums, n-1,sum,dp);
        } else {
            return dp[n][sum] = isSubsetSum(nums,n-1,sum,dp);
        }
    }
}