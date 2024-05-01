class Solution {
    public String reversePrefix(String word, char ch) 
    {
     StringBuilder str=new StringBuilder();  
     boolean isPresent=presentOrNot(word,ch);
     if(!isPresent)
     {
        return word;
     }
     else
     {
        int indexOfTarget=findIndex(word,ch);
        for(int index=0;index<=indexOfTarget;index++)
        {
            str.append(word.charAt(index));
        } 
        str.reverse();
        for(int index=indexOfTarget+1;index<word.length();index++)
        {
            str.append(word.charAt(index));
        }
        return str.toString();
     }
    }

    public boolean presentOrNot(String word, char ch) 
     {
        for(int index=0;index<word.length();index++)
        {
            if(word.charAt(index) == ch)
            {
                return true;
            }
        }    
        return false;
     }

     public int findIndex(String word, char ch) 
     {
        for(int index=0;index<word.length();index++)
        {
            if(word.charAt(index) == ch)
            {
                return index;
            }
        }    
        return 0;
     }
}