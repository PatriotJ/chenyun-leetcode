class Solution {
    public int countPrimeSetBits(int L, int R) {
        Set<Integer>set = new HashSet();
        set.add(2);set.add(3);set.add(5);set.add(7);set.add(11);
        set.add(13);set.add(17);set.add(19);
        int ans = 0;
        while(L <= R){
            int k = Integer.bitCount(L++);
            if(set.contains(k)){
                ans ++;
            }
        }
        return ans;
    }
}