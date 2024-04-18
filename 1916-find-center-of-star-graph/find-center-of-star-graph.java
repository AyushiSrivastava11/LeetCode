class Solution 
{
    public int findCenter(int[][] edges) 
    {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();

        for(int create=0;create<=edges.length+1;create++)
        {
            adj.add(new ArrayList<>());
        }

        for(int index=0 ; index< edges.length;index++)
        {
            adj.get(edges[index][0]).add(edges[index][1]);
            adj.get(edges[index][1]).add(edges[index][0]);
        }   
        for(int index=1;index<=edges.length+1;index++)
        {
            ArrayList<Integer> arr=adj.get(index);
            if(arr.size() == edges.length)
            {
                return index;
            }
        }
        return 0;
    }

}