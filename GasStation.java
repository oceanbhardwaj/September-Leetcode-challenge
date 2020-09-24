/*class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=cost.length;
        int i=0;
        int j=0;
        for(i=0;i<n;i++)
        {
            int count=0;
             int sum=0;
            j=i;
            while(j%n<n)
            {
                int d=gas[j%n];
                int e=cost[j%n];
                sum=sum-e+d;
                count++;
                
                if(sum<0)
                    break;
                if(count==n)
                    return i;
                j++;
                
            }
        }
        return -1;
    }
} */


class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total=0;
        int tank=0;
        int index=0;
        for(int i=0;i<gas.length;i++)
        {
            tank+=gas[i]-cost[i];
            total+=gas[i]-cost[i];
            if(tank<0)
            {
                tank=0;
                index=i+1;
            }
        }
        if(total<0)
            return -1;
        else
            return index;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}











