class Solution {
    public int pivotInteger(int n) 
    {
     int sumOfn=(n*(n+1))/2;
     int compare=(int)Math.sqrt(sumOfn);
     if(compare*compare == sumOfn)return compare;
     return -1;  
    }
}