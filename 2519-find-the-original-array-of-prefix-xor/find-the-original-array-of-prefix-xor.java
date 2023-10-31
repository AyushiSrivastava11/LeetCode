class Solution {
    public int[] findArray(int[] pref) {
        int[] arr= new int[pref.length];
        // arr[0]=pref[0];
        for(int i=0;i<pref.length;i++)
        {
            arr[i]=(i==0)?pref[i]:pref[i-1]^pref[i];
        }
        return arr;
    }
}