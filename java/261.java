class Solution {
    int[] union;
    int[] size;
    public boolean validTree(int n, int[][] edges) {
        int l = edges.length;
        if(l < n-1){
            return false;
        }
        union = new int[n];
        size = new int[n];
        for(int i = 0 ;i < n;i++){
            union[i] = i;
            size[i] = 1;
        }
        for(int[] edge : edges){
            int p = edge[0];
            int q = edge[1];
            if(!connected(p,q)){
                union(p,q);
            }else{
                return false;
            }
        }
        return true;
        
    }
    public int find(int p){
        while(p != union[p]){
            p = union[p];
        }
        return p;
    }
    public boolean connected(int p,int q){
        return find(p) == find(q);
    }
    public void union(int p, int q){
        int ip = find(p);
        int iq = find(q);
        
            if(size[ip] < size[iq]){
                union[ip] = iq;
                size[iq] += size[ip];
            }else{
                union[iq] = ip;
                size[ip] += size[iq];
            }
        
    }
}