class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack= new Stack<>();
        int count=0;
        for(int index=0;index<s.length();index++){
            if( s.charAt(index) == '('){
                stack.push(s.charAt(index));
            }
            else{
                if(stack.isEmpty()){count++;}
                else{stack.pop();}
            }
        }
        return count + stack.size();
    }
}