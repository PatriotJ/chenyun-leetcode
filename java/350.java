class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList();
        Map<Integer,Integer> map = new HashMap();
        for(int i:nums1){
            int v = map.getOrDefault(i,0);
            map.put(i,v+1);
        }
        for(int i:nums2){
            int v = map.getOrDefault(i,0);
            if(v > 0){
                list.add(i);
                map.put(i,v-1);
            }
        }
        int[] ans = new int[list.size()];
        int j = 0;
        for(int i:list){
            ans[j++] = i; 
        }
        return ans;
    }
}