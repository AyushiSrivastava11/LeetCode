/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
   public int binarySearch(int start, int end, int target, MountainArray mountainArr, boolean ascendingCheck) {
    while (start <= end) {
        int mid = start + (end - start) / 2;
        int midValue = mountainArr.get(mid);

        if (midValue == target) {
            return mid;
        }

        if (ascendingCheck) {
            if (midValue < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        } else {
            if (midValue < target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    }
    return -1;
}

    public int findPeak(int start,int end,MountainArray mountainArr)
    {
        // int start=0,end=mountainArr.length();
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(mountainArr.get(mid)<mountainArr.get(mid+1))
            {
                start=mid+1;
            }
            else
            {
                end=mid;
            }
        }
        return start;
    }
    public int findInMountainArray(int target, MountainArray mountainArr)
    {
       int peak=findPeak(0,mountainArr.length()-1,mountainArr);
       int leftRule=binarySearch(0,peak,target,mountainArr,true);
       return (leftRule!=-1)?leftRule:binarySearch(peak,mountainArr.length()-1,target,mountainArr,false);
    }

}