class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> a=new ArrayList<>();
        String s="123456789";
        int lower=String.valueOf(low).length();
        int upper=String.valueOf(high).length();
        for(int i=lower;i<=upper;i++)
        {
            for(int j=0;j<10-i;j++)
            {
                int d=Integer.parseInt(s.substring(j,i+j));
                if(d>=low && d<=high)
                {
                    a.add(d);
                }
                    
                    
            }
        }
        return a;
    }
}