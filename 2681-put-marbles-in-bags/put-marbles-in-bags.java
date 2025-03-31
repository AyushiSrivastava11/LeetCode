class Solution {
    public long putMarbles(int[] weights, int k) 
    {
     List<Integer> prevSum= new ArrayList<>();
     long min=0,max=0;
     for(int i=1;i<weights.length;i++)
     {
         prevSum.add((weights[i]+weights[i-1]));
     }   
     Collections.sort(prevSum);
     for(int i=0;i<k-1;i++)
     {
         min+=prevSum.get(i);
     }
     Collections.sort(prevSum, Collections.reverseOrder()); 
     for(int  i=0;i<k-1;i++)
     {
         max+=prevSum.get(i);
     }

     return (max-min);
    }
}

// class Solution {
//     public long putMarbles(int[] weights, int k) 
//     {
//      int[] costs=new int[weights.length-1];
//      int min=0,max=0;
//      for(int i=0;i<weights.length-1;i++)
//      {
//          costs[i]=weights[i]+weights[i+1];
//      }
//      Arrays.sort(costs);
//       for(int i=0;i<k-1;i++)
//       {
//           min+=costs[i];
//           max+=costs[costs.length-1-i];
//       }
//       return (max-min);
//     }
// }