class Solution {
    public int kthGrammar(int n, int k) 
    {
        if(n==1) return 0;
        int l=1<<(n-2);
        return (k<=l)? kthGrammar(n-1,k):(1-kthGrammar(n-1,k-l));
    }
}