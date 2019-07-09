class Solution {
    public int projectionArea(int[][] grid) {
        int m = grid.length,n = grid[0].length;
        int ans = m * n;
        for(int i = 0;i < m;i++){
            int col = 0,row = 0;
            for(int j = 0;j < n;j++){
                if(grid[i][j] == 0){
                    ans --;
                }
                col = Math.max(col,grid[i][j]);
                row = Math.max(row,grid[j][i]);
            }
            ans += col + row;
        }
        return ans;
    }
}