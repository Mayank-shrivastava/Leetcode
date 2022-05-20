class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        // try to think about binary search 
        int lo = 0;
        int hi = nums.length-1;
        List<Integer> ans = new ArrayList<>();
        while(lo <= hi) {
            int mid = (lo+hi)/2;
            if(nums[mid] < target) {
                lo = mid+1;
            } else {
                hi = mid-1;
            }
        }
        // after the completion of while loop lo will points to the first occurence of the target element
        for(; lo < nums.length && nums[lo] == target; lo++) {
            ans.add(lo);
        }
        return ans;
    }
}