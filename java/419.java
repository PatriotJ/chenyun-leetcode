class Solution {
    public int countBattleships(char[][] board) {
        int m = board.length;
        if(m == 0){
            return 0;
        }
        int n = board[0].length;
        if(n == 0){
            return 0;
        }
        int ans = 0;
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                if(board[i][j] == 'X'){
                    ans ++;
                    dfs(board,i,j);
                }
            }
        }
        return ans;
        
    }
    public void dfs(char[][] board,int m, int n){
        if(0 <= m && m < board.length && 0 <= n && n < board[0].length && board[m][n] == 'X'){
            board[m][n] = '.';
            dfs(board,m+1,n);
            dfs(board,m-1,n);
            dfs(board,m,n+1);
            dfs(board,m,n-1);
        }
    }
}