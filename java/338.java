class Solution {
    public int[] countBits(int num) {
        int[] ans = new int[num+1];
        ans[0] = 0;
        if(num == 0){
            return ans;
        }
        ans[1] = 1;
        if(num == 1){
            return ans;
        }
        int j = 1;
        for(int i = 2; i <= num;i ++){
            if(j * 2 == i){
                j = i;
            }
            ans[i] = ans[i-j]+1;
        }
        return ans;
    }
}