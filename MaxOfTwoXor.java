class Solution {
    public int findMaximumXOR(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=1;j<nums.length;j++)
            {
                max=Math.max(nums[i]^nums[j],max);
            }
        }
        return max;
        
        
        
        
        
        
    }
}