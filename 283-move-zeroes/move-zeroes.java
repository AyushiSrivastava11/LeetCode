class Solution {
    public void moveZeroes(int[] nums) {
        int firstZero=-1;
        for(int index=0;index<nums.length;index++)
        {
            if(nums[index] == 0)
            {
                firstZero=index;
                break;
            }
        }
        if(firstZero == -1) return;
        for(int index2=firstZero+1;index2<nums.length;index2++)
        {
            if(nums[index2] != 0)
            {
                int temp=nums[index2];
                nums[index2]=nums[firstZero];
                nums[firstZero]=temp;
                firstZero++;
            }
        }
    }
}