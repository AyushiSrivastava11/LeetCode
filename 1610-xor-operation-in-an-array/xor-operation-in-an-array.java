class Solution {
    public int xorOperation(int n, int start) 
    {
     int[] nums=new int[n];
     int xored=0;
     for(int index=0;index<n;index++)
     {
        nums[index]=start+2*index;
     }   
     for(int num : nums)
     {
        xored^=num;
     }
     return xored;
    }
}