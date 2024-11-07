class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        for (int a = 0; a < nums.length; a++) {
            if (a > 0 && nums[a] == nums[a - 1])
                continue;
            for (int b = a + 1; b < nums.length; b++) {
                if (b > (a + 1) && nums[b] == nums[b - 1])
                    continue;
                int c = b + 1;
                int d = nums.length - 1;
                while( c<d){
                   long sum = nums[a];
                   sum+=nums[b];
                   sum+=nums[c];
                   sum+=nums[d];
                   if(sum == target){
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(nums[a]);
                    temp.add(nums[b]);
                    temp.add(nums[c]);
                    temp.add(nums[d]);
                    ans.add(temp);
                    c++;
                    d--;
                    while(c<d && nums[c] == nums[c-1]) c++;
                    while(c<d && nums[c] == nums[d+1]) d--;
                   }
                   else if (sum<target){
                    c++;
                   }
                   else{
                    d--;
                   }
                }

            }
        }
        return ans;
    }
}