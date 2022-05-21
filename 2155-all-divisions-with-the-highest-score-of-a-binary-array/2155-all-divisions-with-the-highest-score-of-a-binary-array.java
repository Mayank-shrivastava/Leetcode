class Solution {
    public List<Integer> maxScoreIndices(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int[] left = new int[n+1];
        int[] right = new int[n+1];
        int zerosCnt = 0;
        int onesCnt = 0;
        for(int i = 0; i < n; i++) {
            zerosCnt += nums[i] == 0 ? 1 : 0; // pointer on the start for the left partition
            onesCnt += nums[n-i-1] == 1 ? 1 : 0; // pointer on the last for the right partition
            left[i+1] = zerosCnt;
            if(n-i-1 >= 0) {
                right[n-i-1] = onesCnt;
            }
        }
        
        int max = -1;
        int score = 0;
        for(int i = 0; i <= n; i++) {
            score = left[i] + right[i];
            if(max == score) {
                ans.add(i);
            }
            
            if(max < score) {
                max = score;
                ans.clear();
                ans.add(i);
            }
        }
        return ans;
    }
}