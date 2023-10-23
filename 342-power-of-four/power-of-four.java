class Solution {
    public boolean isPowerOfFour(int n) 
    {
        double x;
        if(n==0)
        {
            return false;
        }
        else if(n==1)
        {
            return true;
        }
        else
        {
           x=(Math.log(n)/Math.log(4));    
           if(Math.floor(x) == Math.ceil(x))
           {
               return true;
           }
           return false;
        }
    }
}