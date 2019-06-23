class Solution {
    int ans = 0;
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        if(m == 0){
            return 0;
        }
        int n = grid[0].length;
        if(n == 0){
            return 0;
        }
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                if(grid[i][j] == 1){
                    dfs(grid,i,j);
                }
            }
        }
        return ans;
        
    }
    public int dfs(int[][] grid,int m, int n){
        if( m < 0 || m >= grid.length || n < 0 || n >= grid[0].length ){
            return 0;
        }
        if(grid[m][n] == 0){
            return 0;
        }
        grid[m][n] = 0;
        
        int a1 = dfs(grid,m-1,n);
        int a2 = dfs(grid,m+1,n);
        int a3 = dfs(grid,m,n-1);
        int a4 = dfs(grid,m,n+1);
        int val = a1+a2+a3+a4+1;
        ans = Math.max(val,ans);
        return val;
    }
}