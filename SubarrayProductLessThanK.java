/*class Solution {  //bruteforce
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++)
        {   int d=1;
            for(int j=i;j<n;j++)
            {    d=d*nums[j];
                if(d<k)
                    count++;
             else
                 break;
                
            }
        }
        return count;
    }
}*/


class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1)
            return 0;
        int left=0;
        int count=0;
        int p=1;
        for(int right=0;right<nums.length;right++)
        { p=p*nums[right];
         while(p>=k)
             p=p/nums[left++];
         count=count+right-left+1;
            
        }
        
       return count; 
        
        
        
        
        
        
        
        
    }
}