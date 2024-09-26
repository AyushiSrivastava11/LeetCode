class Solution {
    public boolean isHappy(int n) {
        int slow = n , fast = n;
        do{
            slow = square(slow); //5
            fast = square(square(fast));//25
        }while( slow!=fast);
        return slow == 1;
    }
    public int square(int num) {
        
        int ans = 0;
        
        while(num > 0) {
            int remainder = num % 10;
            ans += remainder * remainder;
            num /= 10;
        }
        
        return ans;
    }
}