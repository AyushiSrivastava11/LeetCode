class Solution {
    public int minOperations(int[] nums, int k) 
    {
     int xored=0,count=0;
     for(int num : nums)
     {
        xored^=num;
     }   
     while(k>0 || xored > 0)
     {
        if((k%2) != (xored%2))
        {
            count++;
        }
        k/=2;
        xored/=2;
     }
     return count;
    }
}