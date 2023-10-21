class Solution {
    public int constrainedSubsetSum(int[] nums, int k) {
            Deque<Integer> dq = new LinkedList<>();
    int res = Integer.MIN_VALUE;

    for(int i=0; i<nums.length; i++){
        int temp = Math.max(0, dq.isEmpty()?0:nums[dq.peekFirst()]);
        nums[i] += temp;
        res = Math.max(res, nums[i]);

        while(!dq.isEmpty() && nums[i]>=nums[dq.peekLast()]){
            dq.pollLast();
        }
        dq.addLast(i);
        if(i-dq.peekFirst()+1 > k){
            dq.removeFirst();
        }
    }

    return res;
}
    }
