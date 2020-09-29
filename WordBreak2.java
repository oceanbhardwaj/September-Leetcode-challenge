class Solution {
    HashMap<String,List<String>>h=new HashMap<>();
    
    
    public List<String> wordBreak(String s, List<String> wordDict) {
      
        if(h.containsKey(s))
            return h.get(s);
         ArrayList<String> res=new ArrayList<>();
        if(wordDict.contains(s))
            res.add(s);
        for(int i=1;i<=s.length();i++){
            String left=s.substring(0,i);
            
        if(wordDict.contains(left))
        {
           List<String> suffix=  wordBreak(s.substring(i),wordDict);
            for(String sen:suffix)
                res.add(left+" "+sen);}
        
    }
    
    h.put(s,res);
       return res;
        
    }
}