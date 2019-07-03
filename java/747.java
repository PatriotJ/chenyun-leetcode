class Solution {
    public int dominantIndex(int[] nums) {
        int first = 0;
        int second = 0;
        int index = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] > first){
                second = first;
                first = nums[i];
                index = i;
            }else if(nums[i] > second){
                second = nums[i];
            }
        }
        return first >= 2*second ?index:-1;
    }
}