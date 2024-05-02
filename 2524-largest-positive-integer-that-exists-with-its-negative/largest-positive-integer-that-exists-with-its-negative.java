class Solution {
    public int findMaxK(int[] nums) {
        
        Set<Integer> negative=new HashSet<>();
        for(int num : nums)
        {
            if(num<0)
            {
                negative.add(num);
            }
        }
        int k=-1;
        for(int num : nums)
        {
            if(num > k && negative.contains(-num))
            {
                k=num;
            }
        }
        return k;
    }
}