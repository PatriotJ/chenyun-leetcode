class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        int l = nums.length;
        for(int i = 0;i < l; i++){
            for(int j = Math.max(0,i-k);j < i ; j ++){
                if(Math.abs((long)nums[i] - (long)nums[j]) <= t){
                    return true;
                }
                
            }
        }
        return false;
    }
}