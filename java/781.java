class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer,Integer>map = new HashMap();
        for(int i :answers){
            int k = map.getOrDefault(i,0);
            map.put(i,k+1);
        }
        int ans = 0;
        for(int key:map.keySet()){
            int v = map.get(key);
            if(v % (key+1) == 0){
                ans += v;
            }else{
                v /= key+1;
                v ++;
                ans += v*(key+1);
            }
        }
        return ans;
    }
}