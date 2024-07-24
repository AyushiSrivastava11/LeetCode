class Solution {
    public void sortColors(int[] nums) 
    {
    //  Arrays.sort(nums);  
     int zeroes=0,ones=0,n=nums.length;
     //O(N)
     for(int num : nums)
     {
        if(num == 1) ones++;
        else if(num == 0) zeroes++;
     }

     for(int index=0;index<n;index++)
     {
        if( index < zeroes)
        {
            nums[index]=0;
        }
        else if(index>=zeroes && index<(zeroes+ones))
        {
            nums[index]=1;
        }
        else
        {
            nums[index]=2;
        }
     }
    }
}