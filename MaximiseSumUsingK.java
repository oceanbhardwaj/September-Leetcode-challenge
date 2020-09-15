class Solution {
    public int largestSumAfterKNegations(int[] A, int K) {
        int sum=0;
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        for(int i=0;i<A.length;i++)
        {
            pq.add(A[i]);
        }
        while(K>0)
        {
            pq.add(-pq.poll());
            K--;
        }
        while(!pq.isEmpty())
        {
            sum=sum+pq.poll();
        }
        return sum;
    }
}