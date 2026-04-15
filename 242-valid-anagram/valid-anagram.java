class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] Alphabet= new int[26];
        for(int index=0;index<s.length();index++){
            Alphabet[s.charAt(index)-'a']++;
        }
        for(int index=0;index<t.length();index++){
            Alphabet[t.charAt(index)-'a']--;
        }
        for(int index=0;index<Alphabet.length;index++){
            if(Alphabet[index]!=0){
                return false;
            }
        }
        return true;
    }
}