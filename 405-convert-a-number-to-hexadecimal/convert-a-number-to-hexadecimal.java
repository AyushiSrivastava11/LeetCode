class Solution {
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        
        char[] hexChars = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        StringBuilder str = new StringBuilder();
        
        // Using a long to handle the full range of int values
        long n = num & 0xFFFFFFFFL; // Convert to unsigned int
        
        while (n != 0) {
            str.append(hexChars[(int)(n & 15)]); // n & 15 is equivalent to n % 16
            n >>>= 4; // Unsigned right shift by 4 bits
        }
        
        return str.reverse().toString();
    }
}