class Solution {
    public boolean isRobotBounded(String A) {
        int x=0;
        int y=0;
        int dir=0;
        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i)=='R')
                dir=(dir+1)%4;
            else if(A.charAt(i)=='L')
                dir=(4+dir-1)%4;
            else
            {
                if(dir==0)
                    y++;
                else if(dir==1)
                    x++;
                else if(dir==2)
                    y--;
                else
                    x--;
                    
            }
                
        }
        if(x==0 && y==0 || dir!=0)
            return true;
        else 
            return false;
        
    }
}