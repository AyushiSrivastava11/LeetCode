class Solution {
    public int maxArea(int[] height) {
        int maxMarkUp=Integer.MIN_VALUE, left = 0, right = height.length-1;
        while(left<right){
            int dist = right - left;
            int width = Math.min(height[left],height[right]);
            maxMarkUp = Math.max(maxMarkUp,(dist*width));
            if(height[right] > height[left]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxMarkUp;
    }
}