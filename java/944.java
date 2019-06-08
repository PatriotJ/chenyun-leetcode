class Solution {
    public int minDeletionSize(String[] A) {
        int ans = 0;
        for(int i = 0;i < A[0].length();i++){
            for(int r = 0;r < A.length-1;r++){
                if(A[r].charAt(i) > A[r+1].charAt(i)){
                    ans ++;
                    break;
                }
            }
        }
        return ans;
    }
}