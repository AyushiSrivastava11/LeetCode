class Solution {
    public int minKBitFlips(int[] nums, int k) 
    {
      //When k=1, [0,1,0] then we went like arr[index]=0 turn 1 only one time so we check only once and change
      //When k=2, [1,1,0] then it is not possible as we take arr[0],arr[1]=1,1 whe change them it becomes [0,0,0] after that if we choose two number then arr[0],arr[1]=0,0 we change them and
      //It does not work [1,0,1] then we choose arr[1],arr[0] we check is it okay to convert [0,1,1] then we choose [1,2] [0,1,0] Nothing changes
      /*
       So it is clear that
       arr[0],arr[1]=[0,0,0] (Step 1)
       arr[0],arr[2]=[1,0,1]
       arr[1],arr[0]=[0,1,1]
       arr[1],arr[2]=[0,0,0] (this is same as)
       since there is a repeat we can say that it wont work
      */   
      int n = nums.length;
        int[] isFlipped = new int[n];
        int flips = 0, flipCount = 0;

        for (int i = 0; i < n; i++) {
            if (i >= k) {
                flips ^= isFlipped[i - k];
            }

            if (nums[i] == flips % 2) {
                if (i + k > n) {
                    return -1;
                }

                flips ^= 1;
                isFlipped[i] = 1;
                flipCount++;
            }
        }
        return flipCount;
    }
}