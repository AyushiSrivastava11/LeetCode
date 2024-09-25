class Solution {
    public int[] rearrangeArray(int[] nums) {
        int positiveIndex = 0, negativeIndex = 1;
        int[] temp = new int[nums.length];
        for( int index = 0 ;index<nums.length;index++){
            if( nums[index] < 0){
                temp[negativeIndex] = nums[index];
                negativeIndex+=2;
            }
            else
            {
                temp[positiveIndex] = nums[index];
                positiveIndex+=2;
            }
        }
        return temp;
    }
}