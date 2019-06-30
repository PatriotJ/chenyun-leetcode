class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        int l = A.length;
        int cur = K;
        int i = l - 1;
        List<Integer> ans = new ArrayList();
        while(i >= 0 || cur > 0){
            if(i >= 0){
                cur += A[i--];
            }
            ans.add(cur % 10);
            cur /= 10;
        }
        Collections.reverse(ans);
        return ans;
    }
}