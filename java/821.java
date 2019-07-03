class Solution {
    public int[] shortestToChar(String S, char C) {
        int l = S.length();
        int[] ans = new int[l];
        Arrays.fill(ans,l);
        int tmp = l;
        for(int i = 0;i < l;i++){
            if(S.charAt(i) == C){
                tmp = 0;
            }
            ans[i] = Math.min(ans[i],tmp++);
        }
        tmp = l;
        for(int i = l-1;i >= 0;i--){
            if(S.charAt(i) == C){
                tmp = 0;
            }
            ans[i] = Math.min(ans[i],tmp++);
        }
        return ans;
    }
}