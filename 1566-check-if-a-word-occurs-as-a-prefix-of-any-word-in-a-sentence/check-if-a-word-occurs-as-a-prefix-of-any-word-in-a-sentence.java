class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int wordIndex = 1; // Start with 1-based index
        int i = 0; // Pointer to traverse the sentence
        int searchLen = searchWord.length();

        while (i < sentence.length()) {
            // Check if the current word starts with the searchWord
            if (sentence.startsWith(searchWord, i)) {
                // Ensure this is the start of a word (or at index 0)
                if (i == 0 || sentence.charAt(i - 1) == ' ') {
                    return wordIndex;
                }
            }

            // Move to the next word
            while (i < sentence.length() && sentence.charAt(i) != ' ') {
                i++;
            }
            i++; // Skip the space
            wordIndex++; // Increment word index
        }

        return -1; // No match found
    }
}
