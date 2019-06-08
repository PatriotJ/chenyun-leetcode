class Solution {
    // dp
    public boolean isSubsequenceDP(String s, String t) {
        int m = s.length();
        int n = t.length();
        int[][] mat= new int[m+1][n+1];
        for(int i = 1;i < s.length()+1;i++){
            for(int j = 1;j<t.length()+1;j++){
                // int v = 0;
                if(s.charAt(i-1) == t.charAt(j-1)){
                    mat[i][j] = mat[i-1][j-1] + 1;
                }else{
                    mat[i][j] = Math.max(mat[i-1][j],mat[i][j-1]);
                }
            }
        }
        return mat[m][n] == m;
    }
    public boolean isSubsequenceOnePass(String s, String t) {
        char[] ch = s.toCharArray();
        int index = -1;
        for(char c:ch){
            index = t.indexOf(c, index + 1);
            if(index == -1) return false;
        }
        return true;
    }
}