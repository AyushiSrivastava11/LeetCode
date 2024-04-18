class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) 
    {
         if(source == destination )
         {
            return true;
         }
         ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
         for(int index=0;index<=n;index++)
         {
            adj.add(new ArrayList<>());
         }
         for(int traverse=0;traverse<edges.length;traverse++)
         {
            int start=edges[traverse][0];
            int end=edges[traverse][1];
            adj.get(start).add(end);
            adj.get(end).add(start);
         }
         Queue<Integer> queue=new LinkedList<>();
         queue.offer(source);
         boolean[] verified=new boolean[n];
         verified[source]=true;
         
         while(!queue.isEmpty())
         {
            int check=queue.poll();
            for(int neighbors : adj.get(check))
            {
                if(!verified[neighbors])
                {
                    verified[neighbors]=true;
                    queue.offer(neighbors);
                    if(neighbors == destination)
                    {
                        return true;
                    }
                }
            }
         }
         return false;
    }
}