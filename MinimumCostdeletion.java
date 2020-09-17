class Solution {
    public int minCost(String s, int[] cost) {
        int costs=0;
        if(s.length()==0)
            return 0;
        char prev=s.charAt(0);
        int prevcost=cost[0];
      for(int i=1;i<s.length();i++)
      {
          if(prev==s.charAt(i))
          {
              if(prevcost>cost[i])
              {
                   costs=costs+cost[i];
                  
              }
              else
              {
                  costs=costs+prevcost;
                  prevcost=cost[i];
                  prev=s.charAt(i);
              }
          }
          else
          {
              prev=s.charAt(i);
              prevcost=cost[i];
          }
      }
            
            
       return costs; 
    }
}