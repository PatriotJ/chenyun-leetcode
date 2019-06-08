class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer,Integer> map = new HashMap();
        int ans = 0;
        for(int x : A){
            for(int y :B){
                int k = map.getOrDefault(x+y,0);
                map.put(x+y,k+1);
            }
        }
        for(int x : C){
            for(int y : D){
                int k = map.getOrDefault(-x-y,0);
                ans += k;
            }
        }
        return ans;
    }
    
    
}