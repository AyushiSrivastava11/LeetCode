class Solution {
    public List<List<Integer>> subsets(int[] nums) 
    {
         List<List<Integer>> ans=new ArrayList<>();
         ans.add(new ArrayList<>());//Adding empty list in List of List

         for(int num : nums)
         {
            List<List<Integer>> temp=new ArrayList<>();
             for (List<Integer> index : ans) {
                temp.add(
                    new ArrayList<Integer>(index) {
                        {
                            add(num);
                        }
                    }
                );
            }
            for(List<Integer> index : temp)
            {
                ans.add(index);
            }
         }
         return ans;

    }
}