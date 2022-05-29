class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int num1 = -1;
        int num2 = -1;
        int c1 = 0;
        int c2 = 0;
        for(int num : nums) {
            if(num == num1) {
                c1++;
            } else if(num == num2) {
                c2++;
            } else if(c1 == 0) {
                num1 = num;
                c1++;
            } else if(c2 == 0) {
                num2 = num;
                c2++;
            } else {
                c1--;
                c2--;
            }
        }
        int count1 = 0;
        int count2 = 0;
        for(int num : nums) {
            if(c1 > 0 && num1 == num) {
                count1++;
            }
            if(c2 > 0 && num2 == num) {
                count2++;
            }
        }

        if(count1 > nums.length/3) {
            list.add(num1);
        }
        if(count2 > nums.length/3) {
            list.add(num2);
        }
        return list;
    }
}