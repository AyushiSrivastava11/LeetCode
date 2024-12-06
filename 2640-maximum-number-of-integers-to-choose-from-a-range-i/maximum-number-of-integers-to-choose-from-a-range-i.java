class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int[] bannedOrNot = new int[n+1];
        for(int ban : banned){
            if(ban>n){continue;}
            bannedOrNot[ban]=1; 
        }
        int sum=0,count=0;
        for(int index=1;index<=n;index++){
            if(bannedOrNot[index] == 1) {continue;}
            sum+=index;
            if(sum>maxSum){break;}
            count++;
        }
        return count;
    }
}