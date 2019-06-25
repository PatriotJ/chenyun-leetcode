class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        if(m == 0){
            return;
        }
        int n = board[0].length;
        if(n == 0){
            return;
        }
        for(int i = 0;i <m;i++){
            // System.out.println();
            for(int j = 0;j <n;j++){
                status(board,i,j);
            }
        }
        for(int i = 0;i <m;i++){
            for(int j = 0;j <n;j++){
                
                if(board[i][j] == 3){
                    board[i][j] = 0;
                }
                else if(board[i][j] == 2){
                    board[i][j] = 1;
                }
            }
           
        }
    }
    public void status(int[][] board,int k, int v){
        // int death = 0;
        int live = 0;
        for(int i = k-1;i < k+2;i++){
            for(int j = v-1;j < v+2;j++){
                if(i == k && j == v){
                    continue;
                }
                
                    if(i >=0 && i <board.length && j >= 0 && j < board[0].length){
                        live += board[i][j] % 2;
                    }
                
            }
        }
        // System.out.print(live);
        if(board[k][v] == 1){
            if(live < 2 || live > 3){
                board[k][v] = 3;
            }
        }else if(board[k][v] == 0){
            if(live == 3){
                board[k][v] = 2;
            }
        }
    }
}