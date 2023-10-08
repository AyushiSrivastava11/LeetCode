class Solution {
    public int minimumCardPickup(int[] cards)
    {
      Map <Integer,Integer> checkingHash= new HashMap<Integer,Integer>();
      int start=0,end=0,ans=Integer.MAX_VALUE;
      boolean checked=false;
      while(end < cards.length)
      {
          Integer point=checkingHash.get(cards[end]);
          if(point == null)
          {
              checkingHash.put(cards[end],end);
          }
          else
          {
              while(cards[start] != cards[end])
              {
               checkingHash.remove(cards[start]);
               start++;  
              }
               ans=Math.min(ans,(end-start)+1);
               System.out.print(ans);
                  checked=true;
                  checkingHash.put(cards[start],end);
                  start++;
          }
          end++;
      }
      return (!checked)?-1:ans;
    }
}
