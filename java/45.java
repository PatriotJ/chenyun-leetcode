class Solution {
    public int jump(int[] nums) {
        int l = nums.length;
        int start = 0,end = 0;
        int ans = 0;
        while(end < l-1){
            ans ++;
            int tmp_end = end;
            for(int i = start; i <=end;i++){
                if(i + nums[i] > tmp_end){
                    tmp_end = i + nums[i];
                    start = i;
                }
            }
            // start = tmp_start;
            end = tmp_end;
        }
        return ans;
        
    }
}