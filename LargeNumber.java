class Solution {
    public String largestNumber(int[] nums) {
        if(nums.length==0)
            return "";
        String arr[]=new String[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=nums[i]+"";
        }
        Comparator<String> co=new Comparator<String>()
        {
            public int compare(String s1,String s2)
            {
                String x=s1+s2;
                String y=s2+s1;
                return y.compareTo(x);
            }
        };
        Arrays.sort(arr,co);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            sb.append(arr[i]);
        }
        if(arr[0].charAt(0)=='0')
            return "0";
        String str=sb.toString();
        return str;
        
    }
}