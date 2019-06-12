class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int dif = Integer.MAX_VALUE;
        Arrays.sort(nums);
        int l = nums.length;
        int ans = 0;
        if(l < 3){
            return -1;
        }
        for(int i = 0; i < l - 2; i++){
            int lo = i + 1;
            int hi = l - 1;
            while(lo < hi){
                int sum = nums[i] + nums[lo] + nums[hi];
                if(Math.abs(sum-target) < dif){
                    ans = sum;
                    dif = Math.abs(sum-target);
                }else if(sum < target ){
                    lo ++;
                }else{
                    hi --;
                }
            }
        }
        return ans;
    }
}