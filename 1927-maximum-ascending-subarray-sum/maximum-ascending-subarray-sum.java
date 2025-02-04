class Solution {
    public int maxAscendingSum(int[] nums) {
        int max = nums[0], sum = nums[0];
        for(int index=1;index<nums.length;index++){
            int first = nums[index-1];
            int second = nums[index];
            if(first < second){
                sum += second;
            }
            else{
                sum = second;
            }
            max = Math.max(max,sum);
        }
        return max;
        
    }
}