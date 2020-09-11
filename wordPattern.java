class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character,String> h=new HashMap<Character,String>();
        HashMap<String,Character> h1=new HashMap<String,Character>();
        char ch[]=pattern.toCharArray();
        String s[]=str.split(" ");
        int s1=ch.length;
        int s2=s.length;
        if(s1!=s2)
            return false;
        for(int i=0;i<s1;i++)
        {
            if(!h.containsKey(ch[i]))
                h.put(ch[i],s[i]);
            else if(h.containsKey(ch[i]))
            {
                String g=h.get(ch[i]);
                if(!g.equals(s[i]))
                    return false;
            }
            if(!h1.containsKey(s[i]))
                h1.put(s[i],ch[i]);
            else if(h1.containsKey(s[i]))
            {
                String g1=h1.get(s[i])+"";
                if(!g1.equals(ch[i]+""))
                    return false;
            }
            
        }
        return true;
    }
}