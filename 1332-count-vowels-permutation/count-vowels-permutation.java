class Solution {
    public int countVowelPermutation(int n) {
        long a=1,e=1,i=1,o=1,u=1,mod = (long) Math.pow(10, 9) + 7;
        long a1,e1,i1,o1,u1;
        for(int j=2;j<=n;j++)
        {
            a1=(e+i+u)%mod;
            e1=(a+i)%mod;
            i1=(e+o)%mod;
            o1=i;
            u1=(o+i)%mod;
            a=a1;
            e=e1;
            i=i1;
            o=o1;
            u=u1;
        }
        long result = (a + e + i + o + u) % mod;
        return (int) result;
    }
}