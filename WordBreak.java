class Solution {
     HashMap<String,Boolean> h=new HashMap<>();
    public boolean wordBreak(String s, List<String> wordDict) {
        if(wordDict.contains(s))
            return true;
        if(h.containsKey(s))
            return h.get(s);
        for(int i=1;i<s.length();i++)
        {
            String left=s.substring(0,i);
            if(wordDict.contains(left) && wordBreak(s.substring(i),wordDict))
            {  //h.put(s,true);
                return true;
            }
            
        }
        h.put(s,false);
        return false;
    }
}