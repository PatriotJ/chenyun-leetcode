class Solution {
    public void nextPermutation(int[] nums) {
        int l = nums.length;
        int i = l - 2;
        for(;i >= 0 && nums[i] >= nums[i+1];i--){
            // i --;
        }
        
        if(i >= 0){
            int j = l - 1;
            while(j >= 0 && nums[j] <= nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        for(int c = i+1;c <l;c++){
            swap(nums,c,--l);
        }
    }
    
    public void swap(int[] nums, int i,int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}