class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l = nums.length;
        int last = -1, cur = -1;
        int ans = 0;
        for(int i = 0;i < l;i++){
            if(nums[i] == 0){
                if(cur == -1 ){
                    cur = i;
                }else{
                    ans = Math.max(i - last-1,ans);
                    last = cur;
                    cur = i;
                }
            }
        }
        ans = Math.max(ans,l-1-last);
        return ans;
    }
}