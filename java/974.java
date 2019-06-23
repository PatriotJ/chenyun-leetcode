class Solution {
    public int subarraysDivByK(int[] A, int K) {
        Map<Integer,Integer>map = new HashMap();
        int ans = 0,sum = 0,l = A.length;
        map.put(0,1);
        for(int i = 0; i < l;i++){
            sum += A[i];
            int v = sum % K;
            if(v < 0){
                v += K;
            }
            int k = map.getOrDefault(v,0);
            ans += k;
            map.put(v,k+1);
        }
        return ans;
    }
}