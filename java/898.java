class Solution {
    public int subarrayBitwiseORs(int[] A) {
        Set<Integer> set = new HashSet();
        Set<Integer> cur = new HashSet();
        for(int i:A){
            Set<Integer>cur2 = new HashSet();
            for(int y:cur){
                cur2.add(i | y);
            }
            cur2.add(i);
            cur = cur2;
            set.addAll(cur);
        }
        return set.size();
    }
}