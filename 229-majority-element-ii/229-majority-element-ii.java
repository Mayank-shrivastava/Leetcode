class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            if(!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int key : map.keySet()) {
            if(map.get(key) > nums.length/3) {
                list.add(key);
            }
        }
        return list;
    }
}