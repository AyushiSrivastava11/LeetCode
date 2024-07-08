class Solution {
    public int findTheWinner(int n, int k) 
    {
        //Josephus Problem
        int winner=0;
        for(int index=1;index<=n;index++)
        {
            winner=(winner+k)%index;
        }
        return winner+1;
    }
}