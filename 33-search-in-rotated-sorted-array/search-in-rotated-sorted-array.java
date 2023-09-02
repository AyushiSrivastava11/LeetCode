class Solution {
    public int search(int[] arr, int target) {
        int piv=pivot(arr);
        if(piv==-1)
        {
            bin(arr, target, 0,arr.length-1);
        }
         else if(target == arr[piv])
        {
            return piv;
        }
        else if(target >=arr[0])
        {
           return bin(arr, target, 0, piv-1);
        }
        
            return bin(arr, target, piv+1, arr.length-1);   
    }

     int pivot(int[] arr)
    {
        int start=0,end=arr.length-1,mid;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            //case 1
            if(mid < end && arr[mid] >arr[mid+1])
            {
                return mid;
            }
            //case 2
            else if(mid > start && arr[mid]<arr[mid-1])
            {
                return (mid-1);
            }
            //case 3
            else if(arr[mid] <= arr[start])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return -1;

    }

    int bin(int[] arr,int target,int u,int h)
    {
        int mid;
        while(u<=h)
        {
            
            mid=u+(h-u)/2;
            if(target == arr[mid])
            {
                return mid;
            }
            else if(target > arr[mid])
            {
                u=mid+1;
            }
            else
            {
                h=mid-1;
            }
        }
        return -1;
    }
}