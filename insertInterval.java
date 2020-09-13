class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> a=new ArrayList<>();
        int i=0; int n=intervals.length;
        while(i<n && intervals[i][1]<newInterval[0])
        {
            a.add(intervals[i++]);
        }
        int mi[]=newInterval;
        while(i<n && intervals[i][0]<=mi[1])
        {
            mi[0]=Math.min(intervals[i][0],mi[0]);
            mi[1]=Math.max(intervals[i][1],mi[1]);
            i++;
        }
        a.add(mi);
        while(i<n)
            a.add(intervals[i++]);
        return a.toArray(new int[a.size()][2]);
        
    }
}