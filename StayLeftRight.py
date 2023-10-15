class Solution:
    def numWays(self, steps, arrLen):
        MOD = 1000000007
        maxIndex = min(steps // 2, arrLen - 1)
        
        # Initialize a two-row 2D array for dynamic programming
        dp = [[0] * (maxIndex + 1) for _ in range(2)]
        dp[0][0] = 1  # The initial position has 1 way (the starting position)

        for step in range(1, steps + 1):  # Iterate through each step
            current = step % 2  # Current row for storing results
            prev = (step - 1) % 2  # Previous row for retrieving previous results

            for index in range(maxIndex + 1):  # Iterate through possible indices
                dp[current][index] = dp[prev][index] % MOD
                # Copy the number of ways from the previous row (same index)

                if index > 0:
                    dp[current][index] = (dp[current][index] + dp[prev][index - 1]) % MOD
                    # Add the number of ways from the previous row (index - 1)

                if index < maxIndex:
                    dp[current][index] = (dp[current][index] + dp[prev][index + 1]) % MOD
                    # Add the number of ways from the previous row (index + 1)

        return dp[steps % 2][0]  # Return the number of ways to reach index 0 after 'steps' steps
