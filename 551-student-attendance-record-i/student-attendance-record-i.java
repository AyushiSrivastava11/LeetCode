class Solution {
    public boolean checkRecord(String s) 
    {
        if (s.chars().filter(ch -> ch == 'A').count() > 1) {
            return false;
        }
        
        if (s.contains("LLL")) {
            return false;
        }
        
        return true;
    }
}