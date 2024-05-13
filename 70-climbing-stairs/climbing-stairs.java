
class Solution {
    // public int climbStairs(int n) {
    //     int ways = 1;

    //     for (int i = 1; i <= n / 2; i++) {
    //         double sum = 1;

    //         for (int j = i; j < 2 * i; j++) {
    //             sum *= (double)(n - j) / (j - i + 1);
    //         }

    //         ways += sum;
    //     }

    //     return ways;
    // }

    public int climbStairs(int n) 
    {
       int[] dp=new int[n+1];
        dp[0]= 1;
        dp[1]= 1;
        
        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1]+ dp[i-2];
        }
        return dp[n];
    }
}

