class Solution {
    public boolean lemonadeChange(int[] bills) {
        int c5=0,c10=0;
        if(bills[0]!=5)
        {
            return false;
        }

        for(int n : bills)
        {
         if(n == 5)
         {
             c5++;
         }   
         else if(n==10)
         {
             c10++;
             if(c5>=1)
             {
                 c5--;
             }
             else
             {
                 return false;
             }
         }
         else
         {
             if(c10 >=1 && c5>=1)
             {
                 c10--;
                 c5--;
             }
             else if(c5>=3)
             {
                 c5-=3;
             }
             else
             {
                 return false;
             }
         }
        }
        return true;
    }
}