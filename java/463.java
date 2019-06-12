class Solution {
    public int islandPerimeter(int[][] grid) {
        int ans = 0;
        int l = grid.length;
        if(l == 0){
            return 0;
        }
        int k = grid[0].length;
        if(k == 0){
            return 0;
        }
        // System.out.println(k);
        for(int i = 0;i<l;i++){
            for(int j = 0;j<k;j++){
                if(grid[i][j] == 1){
                    ans += 4;
                    ans -= around(grid,i,j);
                }
            }
        }
        return ans;
    }
    
    public int around(int[][] grid, int i,int j){
        int l = grid.length;
        int k = grid[0].length;
        int around = 0;
        if(i-1 >= 0 && grid[i-1][j] == 1){
            around ++;
        }
        if(i + 1 < l && grid[i+1][j] == 1){
            around ++;
        }
        if(j-1>=0 && grid[i][j-1] == 1){
            around ++;
        }
        // System.out.println(j+1);
        if(j+1<k && grid[i][j+1] == 1){
            around ++;
        }
        return around;
    }
}