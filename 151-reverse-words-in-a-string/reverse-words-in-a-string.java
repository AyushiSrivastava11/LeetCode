class Solution {
    public String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        String x = "";
        for(int index=0;index<s.length();index++){
            if(s.charAt(index) != ' '){
                x = x + s.charAt(index);
            }
            else if (!x.isEmpty()) { 
                stack.push(x);
                x = "";
            }
        }
         if(!x.isEmpty()){
            stack.push(x);
            
         }
         x="";
         
         while(!stack.isEmpty()) {
            x = x + stack.pop() + " ";
        }
        return x.trim();
    }
}