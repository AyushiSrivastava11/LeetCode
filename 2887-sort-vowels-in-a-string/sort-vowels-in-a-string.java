// import java.util.Arrays;

class Solution {
    public String sortVowels(String s) {
        int c = 0;

        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                c++;
            }
        }

        char[] vowels = new char[c];
        for (int i = 0, k = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                vowels[k++] = s.charAt(i);
            }
        }

        Arrays.sort(vowels);

        StringBuilder result = new StringBuilder(s);
        for (int i = 0, k = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                result.setCharAt(i, vowels[k++]);
            }
        }

        return result.toString();
    }

    private boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}
