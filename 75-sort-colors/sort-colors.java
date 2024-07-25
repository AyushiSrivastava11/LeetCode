class Solution {
    public void sortColors(int[] nums) {
        int low=0,high=nums.length-1,mid=0;
        while(mid <= high)
        {
            if(nums[mid] == 0)
            {
                //Swap arr[low],arr[mid]
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;

                //Increment low as well as mid as from 0 to mid-1 it is already sorted and our low is pointing to the first interval of 1 so that if we encounter 0 we can swap it with the first position of 1
                low++;
                mid++;
            }
            else if(nums[mid] == 1)
            {
                mid++;
            }
            else
            {
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
    }
}