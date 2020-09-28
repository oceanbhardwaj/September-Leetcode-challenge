/*class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            int sum=0;
            for(int j=i;j<nums.length;j++)
            {
                sum=sum+nums[j];
                if(sum==k)
                {
                    count++;
                    //break;
                }
            }
        }
        return count;
    }
}*/


class Solution {
    public int subarraySum(int[] nums, int k) 
    { HashMap<Integer,Integer> h=new HashMap<>();
     h.put(0,1);
     int sum=0;
     int count=0;
     for(int i=0;i<nums.length;i++)
     {
         sum=sum+nums[i];
         if(h.containsKey(sum-k))
             count=count+h.get(sum-k);
         h.put(sum,h.getOrDefault(sum,0)+1);
     }
        
       return count; 
        
        
        
        
        
        
    }
}