/*class Solution {      //sum method
    public char findTheDifference(String s, String t) {
        int sum=0;
        int sum1=0;
        for(int i=0;i<s.length();i++)
        {
            sum=sum+(int)s.charAt(i);
        }
        for(int i=0;i<t.length();i++)
        {
            sum1=sum1+(int)t.charAt(i);
        }
       return (char)(sum1-sum);
    }
}  */



//bits method
   class Solution {
    public char findTheDifference(String s, String t) {
    int c=0;
        for(int i=0;i<s.length();i++)
        {
            c=c^(int)s.charAt(i);
        }
        
        for(int i=0;i<t.length();i++)
        {
            c=c^(int)t.charAt(i);
        }
        
        
        return (char)c;
        
        
        
        
        
        
        
    }
   }