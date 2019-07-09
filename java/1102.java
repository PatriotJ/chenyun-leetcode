class Solution {
    public int maximumMinimumPath(int[][] A) {
        int m = A.length, n = A[0].length;
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a,b)->b[2]-a[2]);
        pq.add(new int[]{0,0,A[0][0]});
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        while(pq.size()!=0){
            int[] tmp = pq.poll();
            int x = tmp[0],y = tmp[1],val = tmp[2];
            if(x == m-1 && y == n-1 ){
                return val;
            }
            for(int[] dir:dirs){
                if(0 <= x + dir[0] && x +dir[0]<m && y + dir[1] >= 0&& y+dir[1] < n && A[x+dir[0]][y+dir[1]] != -1){
                    pq.add(new int[]{x+dir[0],y+dir[1],Math.min(val,A[x+dir[0]][y+dir[1]])});
                }
            }
            A[x][y] = -1;
        }
        return -1;
    }
}