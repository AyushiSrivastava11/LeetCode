class Solution {
    public boolean isIsomorphic(String s, String t) 
    {
        if(s.length() != t.length())
        {
            return false;
        }
        int[] forS=new int[200];
        int[] forT=new int[200];
        for(int index=0;index<t.length();index++)
        {
            if(forS[s.charAt(index)] != forT[t.charAt(index)])
            {
                return false;
            }
            forS[s.charAt(index)] =index+1;
            forT[t.charAt(index)] =index+1;
        }
        return true;
    }
}