class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c = 0;
        int cnet = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                c++;
            } else {
                cnet = Math.max(cnet, c);
                c = 0;
            }
        }
        return Math.max(c, cnet);
    }
}