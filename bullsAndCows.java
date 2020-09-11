class Solution {
    public String getHint(String secret, String guess) {
        int bulls=0;
        int cows=0;
        ArrayList<Character> a=new ArrayList<Character>();
        for(int i=0;i<secret.length();i++)
        {
           a.add(secret.charAt(i)); 
        }
        for(int i=0;i<guess.length();i++)
        {
            if(secret.charAt(i)==guess.charAt(i) && a.contains(guess.charAt(i)))
            {bulls++;
             
             int d=a.indexOf(guess.charAt(i));
             a.remove(d);}
           
        }
        for(int i=0;i<guess.length();i++)
        {
            if(secret.charAt(i)!=guess.charAt(i) && a.contains(guess.charAt(i)))
            {cows++;
             
             int d=a.indexOf(guess.charAt(i));
             a.remove(d);}
           
        }
                
        
        return bulls+"A"+cows+"B";
            
        
    }
}