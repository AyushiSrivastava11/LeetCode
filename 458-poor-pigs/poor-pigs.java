class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        // int result=(int)Math.ceil(( (int)(Math.log(buckets)/Math.log(2)))/((int)(Math.log((int)(minutesToTest/minutesToDie)+1)/Math.log(2))));
        // return result;
        int res=minutesToTest/minutesToDie,ans=0;
        while((int)Math.pow(res+1,ans)<buckets)
        {
            ans++;
        }
        return ans;
    }
}