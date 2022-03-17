class Solution {
    public void nextPermutation(int[] nums) {
        int index1 = nums.length-2;
        while(index1 >= 0 && nums[index1+1] <= nums[index1]) {
            index1--;
        }
        if(index1 >= 0) {
            int index2 = nums.length-1;
            // get the element greater than the nums[index1]
            while(nums[index2] <= nums[index1]) {
                index2--;
            }
            int temp = nums[index1];
            nums[index1] = nums[index2];
            nums[index2] = temp;
        }
        reverse(nums,index1+1, nums.length-1);
    }
    
    public static void reverse(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}