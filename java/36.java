class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0;i < 9;i++){
            Set<Character> col = new HashSet();
            Set<Character> row = new HashSet();
            for(int j = 0;j <9;j++){
                if(board[i][j] != '.'){
                    if(col.contains(board[i][j])){
                        
                        return false;
                    }
                    col.add(board[i][j]);
                }
                if(board[j][i] != '.'){
                    if(row.contains(board[j][i])){
                        
                        return false;
                    }
                    row.add(board[j][i]);
                }
            }
        }
        for(int i = 0;i < 9;i += 3){
            for(int j = 0;j < 9;j += 3){
                Set<Character> set = new HashSet();
                for(int k = i;k < i + 3;k++){
                    for(int v = j;v < j + 3;v ++){
                        if(board[k][v] != '.'){
                            if(set.contains(board[k][v])){
                                // System.out.println(i + " " + j);
                                return false;
                            }
                            set.add(board[k][v]);
                }
                    }
                }
            }
        }
        return true;
    }
}