class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0; // pointer on nums1
        int j = 0; // pointer on nums2
        int[] temp = new int[m + n];
        int k = 0;
        while(i < m && j < n) {
            if(nums1[i] <= nums2[j]) {
                temp[k] = nums1[i];
                i++;
                k++;
            } else if(nums1[i] > nums2[j]) {
                temp[k] = nums2[j];
                k++;
                j++;
            }
        }

        while(i < m) {
            temp[k] = nums1[i];
            i++;
            k++;
        }

        while(j < n) {
            temp[k] = nums2[j];
            j++;
            k++;
        }
        
        for(int p = 0; p < temp.length; p++) {
            nums1[p] = temp[p];
        }
    }
}