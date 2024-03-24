class Solution {
    // public int findDuplicate(int[] arr) {
    //     int i=0;

    //     while(i<arr.length)
    //     {
    //         if(arr[i] != i+1)
    //         {
    //              int correct= arr[i]-1;
    //         if((arr[i] != arr[correct]))
    //         {
    //             swapped(arr,i,correct);
    //         }
    //         else{
    //             return arr[i];
    //         }
    //         }
    //         else{
    //             i++;
    //         }
    //     }
    //     return -1;
    // }

    // void swapped(int[] arr,int first,int sec)
    // {
    //     int temp=arr[first];
    //     arr[first]=arr[sec];
    //     arr[sec]=temp;
    // }
    public int findDuplicate(int[] arr)
    {
        int[] hashMap=new int[arr.length];
        for(int nums : arr)
        {
            hashMap[nums]++;
            if(hashMap[nums]>1)
            {
                return nums;
            }
        }
        return 0;
    }
}