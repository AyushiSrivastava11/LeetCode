class Solution {
    public int minimumDeletions(String s) {
        //length carries the length
        int length=s.length();
        //dp is array from 0 to string.length so for ababababab  [0-10]//n=10,arr size=11 (0->10)
        int[] dp=new int[length+1];
        //this is a pointer initially at 0 index
        int pointer=0;
        for(int index=1;index<=length;index++)
        {
            //This if case is checking if the previous element of the index is b then our pointer will move forward
            if(s.charAt(index-1) == 'b')
            {
                dp[index]=dp[index-1]; //[0,0]
                pointer++;
            }
            else
            {
                //if previous index is not b then our current index of dp will be modified between last index value in dp+1 or pointer
                dp[index]=Math.min(dp[index-1]+1,pointer);
            }
           
        }
         return dp[length];
    }
}