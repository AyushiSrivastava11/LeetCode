class Solution {
    public int trap(int[] height) {
   int l=0,r=height.length-1,lmax=Integer.MIN_VALUE,rmax=Integer.MIN_VALUE,ans=0;
        while(l<r){
            lmax=Math.max(lmax,height[l]);
            rmax=Math.max(rmax,height[r]);
            ans+=(lmax<rmax)?lmax-height[l++]:rmax-height[r--];
        }
        return ans;
}
}