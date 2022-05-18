class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums.length == 0) return 0;
        int sum = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele: nums) {
            sum += ele;
            if(sum == k) count++;
            if(map.containsKey(sum-k)) {
                count += map.get(sum-k);
            }
            map.put(sum ,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}