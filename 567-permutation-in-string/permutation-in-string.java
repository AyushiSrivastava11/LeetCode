class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        
        int[] s1Count = new int[26];
        int[] windowCount = new int[26];
        
        // Count the frequency of characters in s1
        for (char c : s1.toCharArray()) {
            s1Count[c - 'a']++;
        }
        
        // Initialize the sliding window
        for (int i = 0; i < s1.length(); i++) {
            windowCount[s2.charAt(i) - 'a']++;
        }
        
        // Check if the initial window is a permutation
        if (Arrays.equals(s1Count, windowCount)) return true;
        
        // Slide the window
        for (int i = s1.length(); i < s2.length(); i++) {
            // Remove the leftmost character of the previous window
            windowCount[s2.charAt(i - s1.length()) - 'a']--;
            // Add the rightmost character of the current window
            windowCount[s2.charAt(i) - 'a']++;
            
            // Check if the current window is a permutation
            if (Arrays.equals(s1Count, windowCount)) return true;
        }
        
        return false;
    }
}