// class Solution {
//     public int maxProfit(int[] prices) {
//         int max=0;
//         for(int i=0;i<prices.length-1;i++)
//         {
//             for(int j=i+1;j<prices.length;j++)
//             {
//                 max=Math.max(-prices[i]+prices[j],max);
//             }
//         }
//         return max;
//     }
// }
 class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0)
            return 0;
            
        int arr[]=new int[prices.length];
        arr[0]=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            arr[i]=Math.min(arr[i-1],prices[i]);
        }
        int max=0;
        for(int i=0;i<prices.length;i++)
        {
            max=Math.max(prices[i]-arr[i],max);
        }
        
        return max;
        
        
        
    }
 }