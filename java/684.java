class Solution {
    int max = 1001;
    public int[] findRedundantConnection(int[][] edges) {
        DSU dsu = new DSU(max);
        for(int[] edge:edges){
            if(!dsu.union(edge[0],edge[1])){
                return edge;
            }
        }
        return new int[2];
        // throw new AssertionError();
    }
    class DSU{
        int[] parent;
        int[] rank;
        public DSU(int size){
            parent = new int[size];
            for(int i = 0;i<size;i++){
                parent[i] = i;
            }
            rank  = new int[size];
        }
        public int find(int x){
            if(parent[x] != x){
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }
        
        public boolean union(int x, int y){
            int xr = find(x),yr = find(y);
            if(xr == yr){
                return false;
            }else if(rank[xr]>rank[yr]){
                parent[yr] = xr;
            }else if(rank[xr]<rank[yr]){
                parent[xr] = yr;
            }else{
                parent[yr] = xr;
                rank[xr]++;
            }
            return true;
        }
    }
}