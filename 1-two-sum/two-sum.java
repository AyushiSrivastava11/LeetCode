class Solution 
{
    public int[] twoSum(int[] nums, int target)
    {
        int[] ans={-1,-1};
       /* 
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
           for(int j=i+1;j<nums.length;j++)
           {
               if((nums[i]+nums[j]) == target)
               {
                   ans[0]=i;
                   ans[1]=j;
               }
           }
        }*/
        
        HashMap<Integer , Integer>x= new HashMap<>(); //Hash bana
         for(int i=0;i<nums.length;i++) //nums array traverse hua
         {
             if(x.containsKey(target-nums[i])) //ye check hua ki map me target-nums[i] present h ki nhi
             {
                 ans[0]=i; //agar hua to i ans[0] me gaya
                 ans[1]=x.get(target-nums[i]); //subtract krke element ka index chala jayega
                 break;
             }
             else
             {
                 x.put(nums[i],i); //agar nahi hua to value ko index k saath put krdenge
             }
         }
        
        return ans;
    }
}