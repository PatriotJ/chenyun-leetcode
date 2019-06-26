class Solution {
    public int maxSubArrayLen(int[] nums, int k) {
       
        int ans = 0;
        int sum = 0;
        Map<Integer,Integer>map = new HashMap();
        map.put(0,-1);
        for(int i = 0;i < nums.length;i ++){
            sum += nums[i];
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
            if(map.containsKey(sum-k)){
                ans = Math.max(i - map.get(sum-k),ans);
            }
        }
        return ans;
    }
}