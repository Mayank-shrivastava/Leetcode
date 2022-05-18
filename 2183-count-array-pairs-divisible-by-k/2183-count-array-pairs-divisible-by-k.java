class Solution {
    public long countPairs(int[] nums, int k) {
        long count = 0L;
        HashMap<Integer, Long> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int gcd = gcd(nums[i],k);
            int want = k/gcd;
            for(int ele : map.keySet()) {
                if(ele % want == 0) {
                    count += map.get(ele);
                    //System.out.println(i + "->" + count);
                }
            }
            map.put(gcd, map.getOrDefault(gcd, 0L)+1L);
        }
        // for(Map.Entry m : map.entrySet()) {
        //     System.out.println(m.getKey() + "->" + m.getValue());
        // }
        return count;
    }
    
    public int gcd(int a, int b) {
        if(a>b) return gcd(b,a);
        if(a == 0) return b;
        return gcd(a, b%a);
    }
}