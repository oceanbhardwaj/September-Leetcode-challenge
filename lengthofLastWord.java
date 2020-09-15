class Solution {
    public int lengthOfLastWord(String s) {
     String arr[]=s.split(" ");
        int n=arr.length;
        if(n==0)
            return 0;
        String s1=arr[n-1];
        return s1.length();
        
    }
}