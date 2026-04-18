class Solution {
    public int mirrorDistance(int n) {
        int reverse=reverseInteger(n);
        return Math.abs(n-reverse);
    }

    public int reverseInteger(int n){
        int sum=0,rem=0,x=n;
        while(x!=0){
            rem=x%10;
            sum=sum*10+rem;
            x=x/10;
        }
        return sum;
    }
}