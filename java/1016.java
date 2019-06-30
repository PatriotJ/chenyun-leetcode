class Solution {
    public boolean queryString(String S, int N) {
        for(int i = 1;i<=N;i++){
            String x = Integer.toBinaryString(i);
            if(S.indexOf(x) == -1){
                return false;
            }
        }
        return true;
    }
}