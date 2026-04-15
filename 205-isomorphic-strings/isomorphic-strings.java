class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] m = new int[256];
        int[] n = new int[256];
        int length=s.length();
        for(int index = 0;index<length;index++){
            if(m[s.charAt(index)]!=n[t.charAt(index)]) return false;
            m[s.charAt(index)] = index+1;
            n[t.charAt(index)] = index+1;
        }
        return true;
    }
}