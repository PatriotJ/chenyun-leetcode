class Solution {
    public int totalHammingDistance(int[] nums) {
        int ans = 0;
        int l = nums.length;
        int[] cnt = new int[32];
        for(int num:nums){
            int i = 0;
            while(num > 0){
                cnt[i++] += num&1;
                num >>= 1;
            }
        }
        for(int num:cnt){
            ans += num * (l-num);
        }
        return ans;
        
    }
}