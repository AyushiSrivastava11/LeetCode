class Solution {
    // public boolean isPalindrome(String s) 
    // {
    //  s=removedSpaceAndCaps(s);
    //  return checkPalindrome(string s,0,s.length()-1);
    // }
    // public String removedSpaceAndCaps(String s)
    // {
    //     s=s.toLowerCase();
    //     s=s.replaceAll("\\s","");
    //     return s;
    // }
    // public boolean checkPalindrome(String s,int start,int end)
    // {
        
    //     return checkPalindrome(string s,start+1,end-1);
    // }
    public boolean isPalindrome(String s) 
    {
      int left=0,right=s.length()-1;
      while(left<right)
      {
        char leftIndex=s.charAt(left),rightIndex=s.charAt(right);
        if(!Character.isLetterOrDigit(leftIndex))left++;
        else if(!Character.isLetterOrDigit(rightIndex))right--;
        else if(Character.toLowerCase(leftIndex) != Character.toLowerCase(rightIndex)) return false;
        else
        {
            left++;
            right--;
        }
      }
      return true;
    }
}