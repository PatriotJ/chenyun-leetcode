class Solution {
    public int maxA(int N) {
        if(N <= 6){
            return N;
        }
        return Math.max(maxA(N-4)*3,maxA(N-5)*4);
    }
}