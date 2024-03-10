class Solution {
    public int[] intersection(int[] n1, int[] n2) 
    {
     Arrays.sort(n1);
     Arrays.sort(n2);
     Set<Integer> nums1 = new HashSet<>(Arrays.asList(Arrays.stream(n1).boxed().toArray(Integer[]::new)));
     Set<Integer> nums2 = new HashSet<>(Arrays.asList(Arrays.stream(n2).boxed().toArray(Integer[]::new)));
        
     HashMap<Integer,Integer> hashMap= new HashMap<>();
     List<Integer> ans= new ArrayList<>();
   
    for(int element_n1 : nums1)
    {
        int key=element_n1;
        int freq=0;
        if(hashMap.containsKey(key))
        {
            freq=hashMap.get(key);
        }
        freq++;
        hashMap.put(key,freq);
    }

    for(int element_n2 : nums2)
    {
        int key=element_n2;
        int freq=0;
        if(hashMap.containsKey(key))
        {
            freq=hashMap.get(key);
        }
        freq++;
        hashMap.put(key,freq);
    }
    for(int key : hashMap.keySet())
    {
        Integer value= hashMap.get(key);
        if(value > 1)
        {
            ans.add(key);
        }
    }

     Integer[] ansArray = ans.toArray(new Integer[0]);
     return ans.stream().mapToInt(Integer::intValue).toArray();

    }
}