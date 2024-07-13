class Solution {
    public void rotate(int[] nums, int k) {
        //Observe how [1,2,3,4,5,6,7] is rotating and turning into
        //[5,6,7,1,2,3,4]
        // which means from backward(n-k to k) numbers are reversed, and from front 0 to n-k-1 are reverse
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);

        reverse(nums,k,nums.length-1);



        //[4,3,2,1,7,6,5] rev the whole now 0-n which is the ans

        
    }
    void reverse(int[] nums, int start,int end)
    {
     while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}