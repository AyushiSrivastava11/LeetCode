class Solution {
    public int countPrefixes(String[] words, String s) {
        // int count=0;
        // for(String word: words){
        //     if(s.startsWith(word)) count++;
        // }
        // return count;
        int c=0;
        for(int i=0;i<words.length;i++)
        {
            if(s.startsWith(words[i]))
            {
                c++;
            }
        }
        return c;
    }
}