class Solution {
    public int getCommon(int[] nums1, int[] nums2) 
    {
     HashMap<Integer,Integer> hashMap=new HashMap<>();
     int freq=0;
     for(int index=0;index<nums1.length;index++)
     {
         int key=nums1[index];
         if(hashMap.containsKey(key))
         {
             continue;
         }
         hashMap.put(key,freq);
     }

     for(int element : nums2)
     {
         if(hashMap.containsKey(element))
         {
            freq=hashMap.get(element);
            freq++;
            hashMap.put(element,freq);
         }
     }
     int min=Integer.MAX_VALUE;
     boolean selected=false;
      for (Integer key : hashMap.keySet()) 
      {
            Integer value = hashMap.get(key);
            if(value > 0)
            {
                 selected=true;
                min=Math.min(min,key);
            }
        }
        return (selected)? min: -1;
    }
}