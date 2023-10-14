class Solution {
    public String longestCommonPrefix(String[] strs)
    {
     int id;
     Arrays.sort(strs);
     String s1=strs[0];   
     String s2=strs[strs.length-1];
     for(id=0;(id<s1.length())&& (id<s2.length());id++)
     {
         if(s1.charAt(id) != s2.charAt(id))
         {
             break;
         }
     }
     return s1.substring(0,id);
    }
}