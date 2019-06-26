class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        int l = A.length;
        if(l <= 2){
            return 0;
        }
        int ans = 0;
        int tmp = 2;
        int c = 1;
        int dif = A[1] - A[0];
        for(int i = 2;i <l ;i++){
            if(A[i] - A[i-1] == dif){
                tmp ++;
                // c *= (tmp - 2);
                ans += (tmp-2);
            }else{
                dif = A[i] - A[i-1];
                
                // c = 1;
                tmp = 2;
            }
        }
        return ans;
    }
}