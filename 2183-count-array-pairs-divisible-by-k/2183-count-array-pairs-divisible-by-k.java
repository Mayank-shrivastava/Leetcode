class Solution {
    public long countPairs(int[] nums, int k) {
        long count = 0L;
        HashMap<Integer, Long> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int gcd = gcd(nums[i],k);
            int minPossibleMultiple = k/gcd;
            for(int ele : map.keySet()) {
                if(ele % minPossibleMultiple == 0) {
                    count += map.get(ele);
                }
            }
            map.put(gcd, map.getOrDefault(gcd, 0L)+1L);
        }
        return count;
    }
    
    public int gcd(int a, int b) {
        if(a>b) return gcd(b,a);
        if(a == 0) return b;
        return gcd(a, b%a);
    }
}