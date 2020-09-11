class Solution {
    public int maxProduct(int[] nums) {
        int prev_max=nums[0];
        int prev_min=nums[0];
        int msf=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            int curr_max=Math.max(nums[i],Math.max(nums[i]*prev_max,nums[i]*prev_min));
            int curr_min=Math.min(nums[i],Math.min(nums[i]*prev_max,nums[i]*prev_min));
            msf=Math.max(curr_max,msf);
            prev_max=curr_max;
            prev_min=curr_min;
            
        }
        return msf;
    }
}