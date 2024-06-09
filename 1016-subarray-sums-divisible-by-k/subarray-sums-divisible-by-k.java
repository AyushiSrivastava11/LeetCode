class Solution 
{
    public int subarraysDivByK(int[] nums, int k) 
    {
    int count = 0,prefixSum = 0;
    HashMap<Integer, Integer> prefixMap = new HashMap<>();
    prefixMap.put(0, 1); //[[0,1],[4,1],]
    //nums = [4,5,0,-2,-3,1], k = 5
    for (int num : nums) 
    {
        prefixSum += num; //4+5
        int mod = prefixSum % k;//4+5%5
        if(mod < 0) 
        {
            mod+=k;
        }
        if (prefixMap.containsKey(mod))
        {
            count+=prefixMap.get(mod);
            prefixMap.put(mod, prefixMap.get(mod)+1);
        }
        else
        {
            prefixMap.put(mod, 1);
        }
    }
    return count;
    }
}