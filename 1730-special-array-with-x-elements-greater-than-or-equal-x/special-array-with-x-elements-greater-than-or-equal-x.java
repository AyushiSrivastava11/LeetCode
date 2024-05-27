class Solution {
    public int specialArray(int[] nums) 
    {
        int max=0;
        for(int num : nums)
        {
            max=Math.max(max,num);
        }
        int[] hashMap=new int[max+1];

        for(int num : nums)
        {
            hashMap[num]++;
        }
        int tot=nums.length;
        for(int index=0;index<=max;index++)
        {
            if(index == tot) return index;
            tot-=hashMap[index];
        }
        return -1;
    }
}