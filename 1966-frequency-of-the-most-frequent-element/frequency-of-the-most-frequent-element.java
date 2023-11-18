class Solution {
    public int maxFrequency(int[] nums, int k) {
       int m=0;
       long cur=0;
       Arrays.sort(nums);
       for(int i=0,j=0;j<nums.length;++j)
       {
           cur+=nums[j];
           while(cur+k < ((long)nums[j]*(j-i+1)))
           {
               cur -= nums[i]; 
                i++;
           }
           m=Math.max(m,j-i + 1);
       } 
       return m;
    }
}