class Solution {
    public int maximumCount(int[] arr) {
        int count=0;
        int middle=Bs(arr,0);
        int a=middle,b=middle;
        while(a>=0  && arr[a]>=0)
        {
            a--;
        }
        while(b<arr.length && arr[b]<=0)
        {
            b++;
        }
        return (Math.max((a+1),(arr.length-b)));
    }

    int Bs(int[] arr,int target)
    {
        int start=0,end=arr.length-1,mid=0;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if(arr[mid] == target )
            {
               break;
            }
            else if(arr[mid] > target)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return mid;
    }
}