// class Solution {             //bruteforce
//     public List<Integer> majorityElement(int[] nums) {
//         int n=nums.length;
//         ArrayList<Integer> res=new ArrayList<Integer>();
//         for(int i=0;i<n;i++)
//         { int count=0;
//             for(int j=0;j<n;j++)
//             {
//                 if(nums[i]==nums[j])
//                 {
//                     count++;}
//             }
//             if(count>n/3)
//             { if(!res.contains(nums[i]))
//                 res.add(nums[i]);}
//         }
//         return res;
//     }
// }




//HashMap method

// class Solution {             
//    public List<Integer> majorityElement(int[] nums) {
//        HashMap<Integer,Integer> h=new HashMap<>();
//        int n=nums.length;
//        ArrayList<Integer> res=new ArrayList<>();
//        for(int i=0;i<nums.length;i++)
//        {
//            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
//        }
//        for(int k:h.keySet())
//        {
//            if(h.get(k)>n/3)
//                res.add(k);
//        }
       
       
       
//        return res;
       
     //Third method  
     class Solution {             
  public List<Integer> majorityElement(int[] nums) {  
      int first=Integer.MIN_VALUE;
      int second=Integer.MAX_VALUE;
      int n=nums.length;
      ArrayList<Integer> res=new ArrayList<>();
      int count1=0;
      int count2=0;
      for(int i=0;i<nums.length;i++)
      {
          if(first==nums[i])
              count1++;
          else if(second==nums[i])
              count2++;
          else if(count1==0)
          {
              count1++;
              first=nums[i];
          }
          else if(count2==0)
          {
              count2++;
              second=nums[i];
          }
          else
          {
              count1--;
              count2--;
          }
      }
    count1=0;
      count2=0;
      for(int i=0;i<nums.length;i++)
      {
          if(first==nums[i])
              count1++;
          if(second==nums[i])
              count2++;
      }
      if(count1>n/3)
          res.add(first);
      if(count2>n/3)
          res.add(second);
      
      
      
      
      
      
      
      
      
      
          
  
      return res; 
       
           
   }
}