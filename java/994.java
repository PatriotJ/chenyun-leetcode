class Solution {
    int[][] grid;
    int ans = 0;
    public int orangesRotting(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        LinkedList<int[]> list = new LinkedList();
        for(int i = 0;i<m;i++){
            for(int j = 0;j < n;j++){
                if(grid[i][j] == 2){
                    list.add(new int[]{i,j,0});
                }
            }
        }
        int d = 0;
        while(!list.isEmpty()){
            int[] arr = list.poll();
            int x = arr[0],y = arr[1];
            d = arr[2];
            if(x + 1 < m && grid[x+1][y] == 1){
                grid[x+1][y] = 2;
                list.add(new int[]{x+1,y,d+1});
            }
            if(x - 1 >= 0 && grid[x-1][y] == 1){
                grid[x-1][y] = 2;
                list.add(new int[]{x-1,y,d+1});
            }
            if(y + 1 < n && grid[x][y+1] == 1){
                grid[x][y+1] = 2;
                list.add(new int[]{x,y+1,d+1});
            }
            if( y - 1 >= 0 && grid[x][y-1] == 1){
                grid[x][y-1] = 2;
                list.add(new int[]{x,y-1,d+1});
            }
        }
        for(int i = 0;i<m;i++){
            for(int j = 0;j < n;j++){
                if(grid[i][j] == 1){
                    
                    return -1;
                }
            }
        }
        return d;
    }
    
}