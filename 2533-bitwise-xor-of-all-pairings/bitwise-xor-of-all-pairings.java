class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int x = 0, y = 0;
       for(int num1 : nums1){
        x ^= num1;
       }
        for(int num2 : nums2){
        y ^= num2;
       }
       return (nums1.length % 2 * y )  ^ (nums2.length % 2 * x ); 
    }
}