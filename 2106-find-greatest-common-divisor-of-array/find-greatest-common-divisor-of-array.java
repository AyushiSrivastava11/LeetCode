class Solution {
    public int findGCD(int[] nums) {
        int[] MaxAndMin = smallestAndLargest(nums);
        int small = MaxAndMin[1];
        int large = MaxAndMin[0];
        return gcd(small,large);
    }
    private int gcd(int a, int b)
    {
        if (a == 0)
            return b; 
        return gcd(b % a, a); 
    }
    public int[] smallestAndLargest(int[] nums){
        int[] arr= {Integer.MIN_VALUE,Integer.MAX_VALUE};
        for(int index=0;index<nums.length;index++){
            if(nums[index] > arr[0]){
                arr[0] = nums[index];
            }
            if(nums[index] < arr[1]){
                arr[1] = nums[index];
            }
        }
        return arr;
    }
}