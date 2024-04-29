class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) 
    {
        int ans=0;
     for(int index=0;index<nums.size();index++)
     {
        int countIndexSetBit=decToBinaryOperation(index);
        if(countIndexSetBit == k)
        {
            ans+=nums.get(index);
        }
     }   
     return ans;
    }

    public int decToBinaryOperation(int num)
    {
        int count=0;
        String number=Integer.toBinaryString(num);
        for(int index=0;index<number.length();index++)
        {
            if(number.charAt(index) == '1')
            {
                count++;
            }
        }
        return count;
    }
}