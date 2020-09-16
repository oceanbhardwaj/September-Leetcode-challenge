class Solution {
    class TrieNode{
        TrieNode left=null;
        TrieNode right=null;
    }
    void insert(int n,TrieNode head)
    {
      TrieNode curr=head;
        for(int i=31;i>=0;i--)
        {
            int b=(n>>i)&1;
            if(b==0)
            {
                if(curr.left==null)
                {
                    curr.left=new TrieNode();
                }
                curr=curr.left;
            }
            else
            {
                if(curr.right==null)
                {
                    curr.right=new TrieNode();
                    
                }
                curr=curr.right;
                
                
                
                
            }
        }
        
    }
   static int max(int nums[],TrieNode head)
    {
        
        int max1=0;
       for(int i=0;i<nums.length;i++)
       {  TrieNode c=head;
        int current=0;
           for(int j=31;j>=0;j--)
           {
               int d=(nums[i]>>j)&1;
               if(d==0)
               {
                 if(c.right!=null)
                 {
                     current+=1<<j;
                     c=c.right;
                 }
                   else
                   {
                       c=c.left;
                   }
               }
               else
               {
                  if(c.left!=null)
                  {
                      current+=1<<j;
                      c=c.left;
                  }
                   else
                   {
                           c=c.right;}
                   
                   
                   
                   
                   
               }
                   
                  
                   
                   
                   
               }
           max1=Math.max(max1,current); 
           }
       return max1;  
       }
        
      
        
    
        
        
        
    
        
    public int findMaximumXOR(int[] nums) {
        TrieNode head=new TrieNode();
        for(int i=0;i<nums.length;i++)
        {
            insert(nums[i],head);
        }
        return max(nums,head);
        
        
        
        
        
        
    }
}