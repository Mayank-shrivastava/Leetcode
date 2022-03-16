class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n-1);// reverse the whole array
        reverse(nums, 0, k-1);// reverse k elements of array
        reverse(nums, k, n-1);// now reverse from k to rest;
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