class Solution {
    public int integerBreak(int n) {
        if(n < 3){
            return 1;
        }
        if(n == 3){
            return 2;
        }

        int q = n % 3;
        if(q == 0){
            return (int)Math.pow(3,n/3);
        }else if(q == 1){
            int m = n/3;
            return (int)(Math.pow(3,m-1)*4);
        }else{
            return 2 * (int)Math.pow(3,n/3);
        }
    }
}