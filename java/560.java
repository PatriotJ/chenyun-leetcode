class Solution {
    public int subarraySum(int[] nums, int k) {
        int l = nums.length;
        Map<Integer,Integer>map = new HashMap();
        map.put(0,1);
        int ans = 0,sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            ans += map.getOrDefault(sum-k,0);
            int v =map.getOrDefault(sum,0);
            map.put(sum,v+1);
        }
        return ans;
    }
}