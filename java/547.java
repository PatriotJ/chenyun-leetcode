class Solution {
    int[] union;
    int[] size;
    public int findCircleNum(int[][] M) {
        
        int n = M.length;
        union = new int[n];
        size = new int[n];
        for(int i=0;i <n;i++){
            union[i] = i;
            size[i] = 1;
        }
        for(int i = 0;i < n;i++){
            for(int j = i + 1;j < n;j ++){
                // System.out.println(M[i][i]+" "+M[i][j]);
                if(M[i][j] == 1){
                    union(i,j);
                }
            }
        }
        int ans = 0;
        for(int i = 0;i<n;i++){
            if(union[i] == i){
                ans ++;
            }
        }
        return ans;
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