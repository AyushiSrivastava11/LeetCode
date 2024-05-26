class Solution {
    public int numberOfSpecialChars(String word) 
    {
        String small="abcdefghijklmnopqrstuvwxyz";
        String big="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        int count=0;
        Set<Character> hashSet=new HashSet<>();

        for(int index=0;index<word.length();index++)
        {
            hashSet.add(word.charAt(index));
        }

         for (Character ch : hashSet) {
            int smallIndex = small.indexOf(ch);
            if (smallIndex != -1) {
                char correspondingBigChar = big.charAt(smallIndex);
                if (hashSet.contains(correspondingBigChar)) {
                    count++;
                }
            }
        }

        return count;
    }
}