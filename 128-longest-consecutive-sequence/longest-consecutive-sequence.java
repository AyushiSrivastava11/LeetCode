class Solution {
    public int longestConsecutive(int[] nums) {
        int length = nums.length;
        if(length == 0) return 0;
        HashSet<Integer> hs = new HashSet<>();
        int longest=1,currCount=0;
        for(int num : nums){
            hs.add(num);
        }
        for(int it : hs){
            if(!hs.contains(it-1)){
                currCount=1;
                int x=it;
                while(hs.contains(x+1)){
                    currCount+=1;
                    x+=1;
                }
                longest=Math.max(longest,currCount);
            }
        }
        
        return longest;
    }
}