/*class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        HashSet<Integer> h =new HashSet<>();
        int max=1;
        for(int i=0;i<n;i++)
        {
            h.add(nums[i]);
            max=Math.max(max,nums[i]);
        }
        int t=-1;
        for(int i=1;i<=max;i++)
        {
            if(!h.contains(i))
            {t=i;
             break;}
            
                
        }
        if(t==-1)
            return max+1;
        else 
            return t;
        
    }
}*/


//second method
class Solution {
    public int firstMissingPositive(int[] nums)
    {
int n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<=0 || nums[i]>n)
                nums[i]=n+1;}
            for(int i=0;i<n;i++)
            {   int curr=Math.abs(nums[i]);
                if(curr>n)
                continue;
                curr--;
                if(nums[curr]>0)
                    nums[curr]=-nums[curr];
                
            }
            for(int i=0;i<n;i++)
            {  
                
                if(nums[i]>=0)
                    return i+1;
            }
        
        
        
        
        
      return n+1;  
        
        
        
        
        
        
    }
}
    















