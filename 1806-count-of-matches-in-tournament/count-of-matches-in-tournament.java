class Solution {
    public int numberOfMatches(int n) {
        int sum=0,matches,teams=n;
        if(n<=2)
        {
            return n/2;
        }
        while(teams>1)
        {
            if(teams%2==0)
            {
                matches=teams/2;
                sum+=matches;
                teams/=2;
            }
            else
            {
                matches=(teams - 1) / 2;
                sum+=matches;
                teams=((teams - 1) / 2)+1;
            }
        }
return sum;
    }
}