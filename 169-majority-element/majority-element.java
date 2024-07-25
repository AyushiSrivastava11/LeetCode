class Solution {
    public int majorityElement(int[] nums) {
        int countOfcurrMajor=0,element=0;
        for(int num : nums)
        {
            if(countOfcurrMajor == 0)
            {
                countOfcurrMajor++;
                element=num;
            }
            else if(num == element)
            {
                countOfcurrMajor++;
            }
            else
            {
                countOfcurrMajor--;
            }
        }
        int count=0;
        for(int arr : nums)
        {
            if(arr == element)
            {
                count++;
            }
        }

        if(count > nums.length/2)
        {
            return element;
        }
        return -1;
        
    }
}