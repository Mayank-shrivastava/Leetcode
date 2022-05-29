class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : nums) {
            if(!map.containsKey(ele)) {
                map.put(ele, 1);
            } else {
                map.put(ele, map.get(ele) + 1);
            }
        }

        for(int key : map.keySet()) {
            if(map.get(key) > nums.length/2) {
                return key;
            }
        }
        return -1;
    }
}