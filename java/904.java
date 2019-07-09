class Solution {
    public int totalFruit(int[] tree) {
        int l = tree.length,ans = 0 ;
        Map<Integer,Integer> pos = new HashMap();
        int i = 0;
        for(int j = 0;j < l;j++){
            int k = pos.getOrDefault(tree[j],0);
            pos.put(tree[j],k+1);
            while(pos.size() >= 3){
                k = pos.get(tree[i]);
                pos.put(tree[i],k-1);
                if(pos.get(tree[i]) == 0){
                    pos.remove(tree[i]);
                }
                i++;
            }
            ans = Math.max(ans,j-i+1);
        }
        return ans;
    }
}