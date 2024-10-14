class Solution {
    public String addStrings(String num1, String num2) {
        int carry = 0;
        int a = 0, b = 0, sum=0;
        StringBuilder ans = new StringBuilder();
        int index1 = num1.length() - 1, index2 = num2.length() - 1;// 2 and 3
        while (index1 >= 0 || index2 >= 0 || carry!=0) {
           
            a = (index1 >= 0) ? num1.charAt(index1) - '0' : 0;
            b = (index2 >= 0) ? num2.charAt(index2) - '0' : 0; 
            sum = a + b + carry; // 4, 13
            carry = sum/10;
            int digit=sum%10;
            ans.append(digit);
            index1--;
            index2--;

        }
        return ans.reverse().toString();
    }
}