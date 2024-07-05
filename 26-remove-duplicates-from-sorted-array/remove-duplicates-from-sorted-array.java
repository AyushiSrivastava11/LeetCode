class Solution {
    public int removeDuplicates(int[] nums)
    {
        int start=0;
        for(int index=1;index<nums.length;index++)
        {
            if(nums[index] != nums[start])
            {
                nums[start+1]=nums[index];
                start++;
            }
        }
        return start+1;
    }
}