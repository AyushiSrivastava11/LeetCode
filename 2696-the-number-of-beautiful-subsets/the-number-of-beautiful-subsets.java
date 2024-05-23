class Solution {
    public int beautifulSubsets(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        Arrays.sort(nums);
        return countBeautifulSubsets(nums, k, freqMap, 0) - 1;
    }

    private int countBeautifulSubsets(int[] nums, int difference, Map<Integer, Integer> freqMap, int i) {
        if (i == nums.length) {
            return 1;
        }
        int totalCount = countBeautifulSubsets(nums, difference, freqMap, i + 1);

        if (!freqMap.containsKey(nums[i] - difference)) {
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) +
                    1); 
            totalCount += countBeautifulSubsets(nums, difference, freqMap, i + 1);
            freqMap.put(nums[i], freqMap.get(nums[i]) -
                    1); 
            if (freqMap.get(nums[i]) == 0) {
                freqMap.remove(nums[i]);
            }
        }

        return totalCount;
    }
}