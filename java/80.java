class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int dup = 0;
        int last = 0;
        for(int i = 1;i < nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[last++] = nums[i-1];
                dup = 0;
            }else{
                if(nums[i] == nums[i-1]){
                    if(dup == 0){
                        dup ++;
                        nums[last++] = nums[i-1];
                    }
                }
            }
        }
        if(dup <= 1){
            nums[last++] = nums[nums.length-1];
        }
        return last;
    }
}