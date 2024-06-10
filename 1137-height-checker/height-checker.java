class Solution {
    public int heightChecker(int[] heights) 
    {
     int[] expected = Arrays.copyOf(heights, heights.length);
     int count=0;
     Arrays.sort(expected);
     for(int index=0;index<heights.length;index++)
     {
        if(expected[index] != heights[index])
        {
            count++;
        }
     }
     return count;
    }
}