class Solution {
    public int missingNumber(int[] nums) 
    {
        /*
        //Cycle sort
       int i=0;
       while(i<nums.length)
       {
           if(nums[i] <nums.length  && nums[i]!=nums[nums[i]])
           {
               swapNumbersInsidenumsay(nums,i,nums[i]);
           }
           else
           {
               i++;
           }
       }
       for(int index=0;index<nums.length;index++)
       {
           if(nums[index] != index)
           {
               return index;
           }
       }
       return nums.length;
    }
     void swapNumbersInsidenumsay(int[] nums,int first,int second)
     {
         int temp=nums[first];
         nums[first]=nums[second];
         nums[second]=temp;
     }*/

     //BruteForce : n2 for(1-n):for(index0-n-1) if nums[index] == i break continue return n
     //Better use hashing we have numsay 0-n we will traverse from 1-n if any hashnumsay index has val 0 we will retunr that address
     //Optimal code: 
     
     //a^a=0, a^a^b=0^b=b
     int n = nums.length;
        int ans =0;
        for(int i =1;i<=n;i++){
            ans = ans ^ i;
            ans= ans^nums[i-1];
        }
 
        return ans;
     
    }
}