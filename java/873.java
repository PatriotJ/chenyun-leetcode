class Solution {
    public int lenLongestFibSubseq(int[] A) {
        int l = A.length;
        Map<Integer,Integer>index = new HashMap();
        for(int i = 0;i<l;i++){
            index.put(A[i],i);
        }
        Map<Integer,Integer> longest = new HashMap();
        int ans = 0;
        for(int i = 0;i < l;i++){
            for(int j = 0;j < i;j++){
                int k = index.getOrDefault(A[i]-A[j],-1);
                if(k >= 0 && k < j){
                    int card = longest.getOrDefault(k*l+j,2)+1;
                    longest.put(j*l+i,card);
                    ans = Math.max(ans,card);
                }
            }
        }
        return ans >= 3? ans:0;
    }
}