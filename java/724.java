class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int num:nums){
            sum += num;
        }
        int tmp = 0;
        for(int i = 0;i < nums.length;i++){
            if(tmp * 2 + nums[i] == sum){
                return i;
            }
            tmp += nums[i];
        }
        return -1;
    }
}