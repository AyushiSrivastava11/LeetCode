class Solution {
    public int[] applyOperations(int[] nums) {

        for(int index=0;index<nums.length-1;index++){
            if(nums[index] == 0){
                continue;
            }
            int first = nums[index];
            int second = nums[index+1];
           if(first == second){
            nums[index] = first * 2;
            nums[index+1] = 0;
           }
        }

        //Move all zeroes to back
        nums = moveZeroesToBack(nums);
        return nums;
    }

    public int[] moveZeroesToBack(int[] nums){
        int j=-1;
        for(int index=0;index<nums.length;index++){
            if(nums[index] == 0){
                j=index;
                break;
            }
        }
        if(j == -1) return nums;
        for (int i = j + 1; i < nums.length; i++) {
            if (nums[i] != 0) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                j++;
            }
        }
        return nums;
    }
}