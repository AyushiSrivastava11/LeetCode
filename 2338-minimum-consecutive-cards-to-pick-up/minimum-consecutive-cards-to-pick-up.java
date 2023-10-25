class Solution {
    public int minimumCardPickup(int[] cards)
    {
    // //   Map <Integer,Integer> checkingHash= new HashMap<Integer,Integer>();
    // //   int start=0,end=0,ans=Integer.MAX_VALUE;
    // //   boolean checked=false;
    // //   while(end < cards.length)
    // //   {
    // //       Integer point=checkingHash.get(cards[end]);
    // //       if(point == null)
    // //       {
    // //           checkingHash.put(cards[end],end);
    // //       }
    // //       else
    // //       {
    // //           while(cards[start] != cards[end])
    // //           {
    // //            checkingHash.remove(cards[start]);
    // //            start++;  
    // //           }
    // //            ans=Math.min(ans,(end-start)+1);
    // //            System.out.print(ans);
    // //               checked=true;
    // //               checkingHash.put(cards[start],end);
    // //               start++;
    // //       }
    // //       end++;
    // //   }
    //   return (!checked)?-1:ans;
    // boolean[] checked= new boolean[1000001]; //all are intially false
    // boolean present=false;
    // int start=0,ans=Integer.MAX_VALUE,n=cards.length;
    // for(int end=0;end<n;end++)
    // {
    //     if(checked[cards[end]])
    //     {
    //         while(cards[start] != cards[end])
    //         {
    //             checked[cards[start]]=false;
    //             start++;
    //         }
    //         ans=Math.min(ans,(end-start+1));
    //         present=true;
    //         start++;
    //     }
    //     else
    //     {
    //         checked[cards[end]]=true;
    //     }
    // }
    
    // return (present)?ans:-1;
    boolean[] selected= new boolean[1000001];
    boolean present=false;
    int start=0,ans=Integer.MAX_VALUE,n=cards.length;
    for(int i=0;i<n;i++)
    {
        if(selected[cards[i]])
        {
            while(cards[start] != cards[i])
            {
               selected[cards[start]]=false;
               start++;
            }
            ans=Math.min(ans,(i-start+1));
            present=true;
            start++;
        }
        else
        {
            selected[cards[i]]=true;
        }
    }
    return (present)?ans:-1;
    }
}
