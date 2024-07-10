class Solution {
    public int minOperations(String[] logs) 
    {
        int count=0;
        for(int index=0;index<logs.length;index++)
        {
            if(logs[index].startsWith(".."))
            {
               //Go to parent or do nothing if already in parent 
               if(count != 0)
               {
                count--;
               }
            }
            else if(logs[index].startsWith("."))
            {
                //Do nothing
            }
            else
            {
                //increase the count
                count++;
            }
        }
        return count;
    }
   
}