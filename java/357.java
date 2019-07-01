class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n == 0){
            return 1;
        }
        // if(n == 1){
        //     return 10;
        // }
        int ans = 9;
        int cur = 9,m = n;
        while(n-- > 1){
            ans *= cur--;
        }
        return ans + countNumbersWithUniqueDigits(m-1);
    }
}