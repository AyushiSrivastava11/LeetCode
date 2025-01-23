class Solution {
    public int maxProduct(int[] nums) {
        int prefix = 1, suffix = 1;
        int max=Integer.MIN_VALUE;
        for(int index=0;index<nums.length;index++){
            if(prefix == 0) prefix = 1;
            if(suffix == 0) suffix = 1;

            prefix *= nums[index];
            suffix *= nums[nums.length - 1 - index]; 
            max = Math.max(max, Math.max(prefix,suffix));
        }
        return max;
    }
}