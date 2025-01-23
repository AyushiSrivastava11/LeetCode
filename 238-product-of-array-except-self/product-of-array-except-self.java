class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        Arrays.fill(ans,1);
        int current_product = 1;
        for(int index=0;index<nums.length;index++){
            ans[index] *= current_product;
            current_product *= nums[index];
        }
        current_product=1;
        for(int index=nums.length-1;index>=0;index--){
            ans[index] *= current_product;
            current_product *= nums[index];
        }
        return ans;
    }
}