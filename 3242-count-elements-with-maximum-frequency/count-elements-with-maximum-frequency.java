class Solution {
    public int maxFrequencyElements(int[] nums) 
    {
        //using HashMap List
        return usingHashMapList(nums);

        //using HashMap Array
        // return usingHashMapArray(nums);

    }
    public int usingHashMapList(int[] nums)
    {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int element : nums)
        {
            int key=element,frequency=0;
            if(hashMap.containsKey(key))
            {
                frequency=hashMap.get(key);
            }
            frequency++;
            hashMap.put(key,frequency);
        }
        int count=0,max=0;
        for (Integer key : hashMap.keySet()) {
            Integer value = hashMap.get(key);
            max=Math.max(max,value);
        }
        for (Integer key : hashMap.keySet()) {
            Integer value = hashMap.get(key);
            if(value == max)
            {
                count++;
            }
        }
        return max*count;
    }
    /*
    public int usingHashMapArray(int[] nums)
    {
        int max=0,count=0;
        for(int element : nums)
        {
            max=Math.max(max,element);
        }

        int[] HashMap=new int[max+1];
        max=0;

        //Pre storing
        for(int index=0;index<nums.length;index++)
        {
            HashMap[nums[index]]++;
        }
        for(int frequency : HashMap)
        {
            max=Math.max(max,frequency);
        }
        for(int frequency : HashMap)
        {
            if(frequency == max)
            {
                count++;
            }
        }
        return count*max;

    }*/
}