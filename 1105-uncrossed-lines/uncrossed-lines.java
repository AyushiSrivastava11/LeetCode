class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) 
    {
        int[][] memory=new int[nums1.length+1][nums2.length+1];
        for(int[] temp : memory)
        {
            Arrays.fill(temp,-1);
        }
        return implementUpdate( nums1.length, nums2.length, nums1, nums2, memory);
    }
    public int implementUpdate(int row,int col,int[] nums1,int[] nums2,int[][] memory)
    {
        if(row<=0 || col<=0)
        {
            return 0;
        }
        if(memory[row][col] != -1)
        {
            return memory[row][col];
        }
        if(nums1[row-1] == nums2[col-1])
        {
            memory[row][col]=1+implementUpdate(row-1,col-1,nums1, nums2, memory);
        }
        else
        {
            memory[row][col]=Math.max(implementUpdate(row-1,col,nums1, nums2, memory),implementUpdate(row,col-1,nums1, nums2, memory));
        }
        return memory[row][col];
    }
}