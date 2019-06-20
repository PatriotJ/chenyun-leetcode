class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList();
        int m = matrix.length;
        if(m == 0){
            return ans;
        }
        int n = matrix[0].length;
        if(n == 0){
            return ans;
        }
        int up = 0,bot = m - 1,l = 0,r = n-1;
        int i = 0;
        while(l <= r && up <= bot){
            if(i == 0){
                int j = l;
                while(j <= r ){
                    // System.out.println(j + " "+ matrix[j][up]);
                    ans.add(matrix[up][j++]);
                }
                up ++;
                i = 1;
            }else if(i == 1){
                int j = up;
                while(j <= bot){
                    ans.add(matrix[j++][r]);
                }
                r --;
                i = 2;
            }else if(i == 2){
                int j = r;
                while(j >= l){
                    ans.add(matrix[bot][j--]);
                }
                bot --;
                i = 3;
            }else{
                int j = bot;
                while(j >= up){
                    ans.add(matrix[j--][l]);
                }
                l ++;
                i = 0;
            }
        }
        return ans;
    }
}