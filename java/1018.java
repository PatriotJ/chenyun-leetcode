class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> ans = new ArrayList();
        long k = 0;
        for(int i = 0; i < A.length;i++){
            k += A[i];
            if(k % 5 == 0){
                ans.add(true);
            }else{
                ans.add(false);
            }
            k %= 10;
            k *= 2;
        }
        return ans;
    }
}