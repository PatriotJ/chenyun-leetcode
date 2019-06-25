class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int i = 1;
        int lo = 0, hi = n-1, up = 0,bot = n-1;
        int status = 1;
        while(i <= n * n){
            
            if(status == 1){
                int j = lo;
                while(j <= hi){
                    ans[up][j++] = i++;
                }
                status = 2;
                up ++;
                // System.out.println(i);
            }
            else if(status == 2){
                int j = up;
                while(j <= bot){
                    ans[j++][hi] = i++;
                }
                status = 3;
                hi --;
                // System.out.println(i);
            }
            else if(status == 3){
                int j = hi;
                while(j >= lo){
                    ans[bot][j--] = i++;
                }
                status = 4;
                bot --;
                // System.out.println(i);
            }
            else if(status == 4){
                int j = bot;
                while(j >= up){
                    ans[j--][lo] = i++;
                }
                status = 1;
                lo ++;
                // System.out.println(i);
            }
            
        }
        return ans;
    }
}