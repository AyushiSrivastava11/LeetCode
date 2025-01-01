class Solution {
    public int maxScore(String s) {
        int max_score = Integer.MIN_VALUE;
        int left = 0, right = 0, total = 0;
        
        for(int index=0;index<s.length();index++){
            if(s.charAt(index) == '1') total++;
        }
        for(int index=0;index<s.length()-1;index++){
           if(s.charAt(index) == '0')left++;
           if(s.charAt(index) == '1')right++;
           int current = left + (total - right);
           max_score=Math.max(max_score,current);
        }
        return max_score;
    }
}