class Solution {
    public int waysToSplitArray(int[] nums) {
         long left=0,right=0;
        for(int index=0;index<nums.length;index++){
            right+=nums[index];
        }
        int count=0;
        for(int index=0;index<nums.length-1;index++){
            left +=nums[index];
            right -= nums[index];
            if(left >= right){
                count++;
            }
        }
        return count;
    }
}