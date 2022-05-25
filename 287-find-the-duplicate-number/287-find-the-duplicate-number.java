class Solution {
    public int findDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr) {
            if(!set.contains(ele)) {
                set.add(ele);
            } else {
                return ele;
            }
        }
        return -1;
    }
}