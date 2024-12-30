class Solution {
    public int maximumProduct(int[] nums) 
    {
        int product=1,anotherProduct=1;
        for(int arr :nums)
        {
            product*=arr;
        }
      if(nums.length==3)
      {
          return product;
      }
     int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,max3=Integer.MIN_VALUE;
     int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
     for(int arr: nums)
     {
         if(arr>=max1)
         {
             max3=max2;
             max2=max1;
             max1=arr;
         }
         else if(arr>=max2)
         {
             max3=max2;
             max2=arr;
         }
         else if( arr >=max3)
         {
             max3=arr;
         }
         if(min1>=arr)
         {
             min2=min1;
             min1=arr;
         }
         else if(min2>=arr)
         {
             min2=arr;
         }
     }
     return  Math.max((max1*max2*max3) , (max1*min2*min1));

    }
}