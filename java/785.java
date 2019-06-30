class Solution {
    public boolean isBipartite(int[][] graph) {
        int l = graph.length;
        int[] colors = new int[l];
        for(int i = 0;i<l;i++){
            if(colors[i] == 0){
                if(dfs(graph,colors,i,1) == false){
                return false;
            }
            }
            
        }
        return true;
    }
    public boolean dfs(int[][] graph,int[] colors,int cur,int color){
        if(colors[cur] != 0){
            if(colors[cur] == color){
                return true;
            }
            return false;
        }
        if(colors[cur] == 0){
            colors[cur] = color;
        }
        for(int p:graph[cur]){
            if(dfs(graph,colors,p,3-color) == false){
                return false;
            }
        }
        return true;
    }
}