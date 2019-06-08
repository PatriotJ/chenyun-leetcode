class Solution {
    public int repeatedNTimes(int[] A) {
        Map<Integer,Integer> map = new HashMap();
        for(int i = 0;i<A.length;i++){
            int k = map.getOrDefault(A[i],0);
            if(k != 0){
                return A[i];
            }
            map.put(A[i],k+1);
        }
        return -1;
    }
}