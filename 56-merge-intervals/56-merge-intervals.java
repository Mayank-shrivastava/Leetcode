class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0], b[0]));//sorting the intervals acc. to start
        List<int[]> list = new ArrayList<>();
        for(int[] interval : intervals) {
            if(list.size() == 0) {
                list.add(interval);
            } else {
                int[] previousInterval = list.get(list.size() - 1); 
                // end of previous interval > start of interval
                if(previousInterval[1] >= interval[0]) {
                    previousInterval[1] = Math.max(previousInterval[1], interval[1]);
                } else {
                    list.add(interval);
                }
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}