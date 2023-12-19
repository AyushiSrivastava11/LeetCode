class Solution {
   
    public boolean isValid(String s) 
    {
        Stack<Character> stacks= new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '(')
             {
                 stacks.push(')');
                 }
            else if(s.charAt(i) == '{') 
            {
                stacks.push('}');
            }
           else if(s.charAt(i) == '[')
            {
                stacks.push(']');
            }
            else if (stacks.isEmpty() || stacks.pop() != s.charAt(i))
            {
                return false;
            }
        }
        return stacks.isEmpty();
    }
}