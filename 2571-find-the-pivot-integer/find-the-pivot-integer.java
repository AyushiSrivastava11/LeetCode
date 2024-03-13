class Solution {
    public int pivotInteger(int n) 
    {
    //  boolean found=false;
    int sum=0;
     for(int i=1;i<=n;i++)
     {
        sum+=i;
        int sum2=0;
        for(int j=i;j<=n;j++)
        {
            sum2+=j;
        }
        if(sum2<sum2)
        {
            return -1;
        }
        if(sum == sum2)
        {
            return i;
        }
     }
     return -1;
    }
}