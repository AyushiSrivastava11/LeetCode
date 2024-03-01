class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[] arr=s.toCharArray();
        int ctr=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='1')
            {
                ctr++;
                arr[i]='0';
            }
        }
        int n=arr.length;
        arr[n-1]='1';
        if(ctr > 1)
        {
            for(int i=0;i<ctr-1;i++)
            {
                arr[i]='1';
            }
        }
        return new String(arr);
    }
}