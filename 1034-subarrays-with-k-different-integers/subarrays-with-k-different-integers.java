// class Solution {
//     public int subarraysWithKDistinct(int[] nums, int k) 
//     {
//         return slidingWindowAtMost(nums, k) - slidingWindowAtMost(nums, k - 1);
//     }
//     public int slidingWindowAtMost(int[] nums, int k)
//     {
//         Map<Integer,Integer> hashMap=new HashMap<>();
//         int left=0,total=0;
        
//         for(int right=0;right<nums.length;right++)
//         {
//             int windowSize=right-left+1;
//             int freq=0;
//             if(hashMap.containsKey(nums[right]))
//             {
//                 freq=hashMap.get(nums[right]);
//             }
//             freq++;
//             hashMap.put(nums[right],freq);
//             if(hashMap.size() <= k)
//             {
//                 total+=windowSize;
//                 // right++;
//             }
//             else
//             {
//                 freq = hashMap.get(nums[left]);
          
//                 if(freq == 1)
//                 {
//                     hashMap.remove(nums[left]);
//                 }
          
//                 freq--;
//                 hashMap.put(nums[left], freq);
//                 left++;
//             }
//         }
//         return total;
//     }
// }
class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return slidingWindowAtMost(nums, k) - slidingWindowAtMost(nums, k - 1);
    }

    private int slidingWindowAtMost(int[] nums, int distinctK) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int left = 0, totalCount = 0;

        for (int right = 0; right < nums.length; right++) {
            freqMap.put(nums[right], freqMap.getOrDefault(nums[right], 0) + 1);

            while (freqMap.size() > distinctK) {
                freqMap.put(nums[left], freqMap.get(nums[left]) - 1);
                if (freqMap.get(nums[left]) == 0) {
                    freqMap.remove(nums[left]);
                }
                left++;
            }

            totalCount += (right - left + 1);
        }
        return totalCount;
    }
}
