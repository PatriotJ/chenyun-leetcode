class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int N = nums.length;
        int j = 0;
        for(;i < N;i++){
            if(nums[i] != 0){
                nums[j++] = nums[i];
            }
        }
        for(;j<N;j++){
            nums[j] = 0;
        }
    }
}