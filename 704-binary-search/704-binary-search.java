class Solution {
    public int search(int[] nums, int target) {
        // (recursive binary search)
        return binarySearch(nums, target, 0, nums.length-1);
    }
    
    public int binarySearch(int[] nums, int target, int lo, int hi) {
        if(hi < lo) {
            return -1;
        }
        
        int mid = (lo+hi)/2;
        if(nums[mid] == target) {
            return mid;
        }
        
        if(nums[mid] > target) {
            return binarySearch(nums,target,lo, mid-1);
        }
        return binarySearch(nums,target, mid+1, hi);
    }
}