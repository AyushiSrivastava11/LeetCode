class Solution {
    public int findCircleNum(int[][] isConnected) 
    {
        int numberOfCities=isConnected.length;
        int[] visit=new int[numberOfCities];
        int numberOfConnected=0;
        for(int nodes=0;nodes<numberOfCities;nodes++)
        {
            if(visit[nodes]==0)
            {
                numberOfConnected+=1;
                dfs(nodes,isConnected,visit);
            }
        }
        return numberOfConnected;

    }
    public void dfs(int node,int[][] isConnected,int[] visit)
    {
        visit[node]=1;
        for(int inside=0;inside<isConnected.length;inside++)
        {
            if(isConnected[node][inside] == 1 && visit[inside]== 0)
            {
                dfs(inside,isConnected,visit);
            }
        }
    }
}