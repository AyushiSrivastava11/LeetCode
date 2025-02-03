class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int increaseCount = 1, decreaseCount = 1, ans =1;
        for(int index = 1;index < nums.length;index++){
            int first = nums[index-1];
            int second = nums[index];
            if(first < second){
                increaseCount += 1;
                decreaseCount = 1;
            }
            else if(first > second){
                decreaseCount +=1;
                increaseCount = 1;

            }
            else{
                increaseCount = 1;
                decreaseCount = 1;
            }
            ans = Math.max(ans,Math.max(increaseCount,decreaseCount));
        }
        return ans;
    }
}