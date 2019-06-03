class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList();
        Set<Integer>set = new HashSet();
        for(int i:nums1){
            set.add(i);
        }
        for(int i:nums2){
            if(set.contains(i)){
                list.add(i);
                set.remove(i);
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