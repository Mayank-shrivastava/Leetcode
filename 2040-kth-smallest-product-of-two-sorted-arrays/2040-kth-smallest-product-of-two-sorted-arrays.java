class Solution {
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        long lo = (long)-1e10;
        long hi = (long)1e10;
        long ans = 0;
        while(lo <= hi) {
            long mid = (lo + hi)/2;
            if(countNumberOfElements(nums1,nums2, mid) >= k) {
                ans = mid;
                hi = mid-1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }
    
    public long countNumberOfElements(int[] nums1, int[] nums2, long dotProduct) {
        long ans = 0;
        for(int e1 : nums1) {
            int count = 0;
            if(e1 >= 0) {
                int lo = 0;
                int hi = nums2.length-1;
                while(lo <= hi) {
                    int mid = (lo + hi)/2;
                    if((long)e1 * nums2[mid] <= dotProduct) {
                        count = mid + 1;
                        lo = mid+1;
                    } else {
                        hi = mid-1;
                    }
                }
                ans = ans + count;
            } else {
                int lo = 0;
                int hi = nums2.length-1;
                while(lo <= hi) {
                    int mid = (lo+hi)/2;
                    if((long)e1*nums2[mid] <= dotProduct) {
                        count = nums2.length-mid;
                        hi = mid-1;
                    } else {
                        lo = mid+1;
                    }
                }
                ans = ans + count;
            }
        }
        return ans;
    }
}