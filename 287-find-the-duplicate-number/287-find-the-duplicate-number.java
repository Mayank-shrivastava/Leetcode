class Solution {
    public int findDuplicate(int[] arr) {
        // cyclic sort
        int i = 0; 
        while(i < arr.length) {
            if(arr[i] != i+1) {
                int correct = arr[i] - 1;
                if(arr[i] != arr[correct]) {
                    // swap arr[i] and arr[correct]
                    int temp = arr[i];
                    arr[i] = arr[correct];
                    arr[correct] = temp;
                } else {
                    return arr[i]; // duplicate number
                }
            } else {
                i++;
            }
        }
        return -1;
    }
}