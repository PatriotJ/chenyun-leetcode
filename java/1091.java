class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int m = grid.length,n = grid[0].length;
        LinkedList<int[]> list = new LinkedList();
        Set<Integer> visited = new HashSet();
        int[][] dirs={{1,1},{1,0},{0,1},{-1,1},{1,-1},{0,-1},{-1,0},{-1,-1}};
        if(grid[0][0] == 1){
            return -1;
        }
        int layer = 1;
        list.add(new int[]{0,0});
        visited.add(0);
        while(list.size() != 0){
            int k = list.size();
            for(int i = 0;i < k;i++){
                int[] tmp = list.poll();
                
                if(tmp[0] == m-1 && tmp[1] == n-1){
                    return layer;
                }
                for(int[] dir:dirs){
                    int r = tmp[0]+dir[0];
                    int c = tmp[1] + dir[1];
                    int[] tt = new int[]{r,c};
                    if(r >= 0 && r < m && c >= 0 && c < n && !visited.contains(r*m+c) && grid[r][c] == 0){
                        list.add(tt);
                        visited.add(r * m + c);
                    }
                }
            }
            layer ++;
        }
        return -1;
    }
}