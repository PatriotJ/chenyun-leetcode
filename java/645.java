class Solution {
    public int[] findErrorNums(int[] nums) {
        int l = nums.length;
        int dup = -1,missing = 1;
        for(int i = 0;i < l;i++){
            int k = nums[i];
            if(nums[Math.abs(k)-1] < 0){
                dup = Math.abs(k);
            }else{
                nums[Math.abs(k)-1] *= -1;
            }
        }
        for(int i = 1;i < l;i++){
            if(nums[i] > 0){
                missing = i + 1;
            }
        }
        return new int[]{dup,missing};
    }
}