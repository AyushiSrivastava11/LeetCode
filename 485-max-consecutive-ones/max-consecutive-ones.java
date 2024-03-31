class Solution {
    public int findMaxConsecutiveOnes(int[] nums)
    {
       int hashMap=0;
        int count=0;
       for(int num : nums)
       {
           if(num ==1)
           {
              hashMap++;
           }
           else
           {
               count=Math.max(count,hashMap);
               hashMap=0;
           }
           
       }
        return Math.max(hashMap,count);
    }
}