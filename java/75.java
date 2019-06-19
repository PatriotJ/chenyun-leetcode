class Solution {
    public void sortColors(int[] nums) {
        // three pointer quick sort
        int pivot = 1;
        int cur = 0;
        int lo = 0;
        int hi = nums.length-1;
        int tmp;
        while(lo <= hi){
            if(nums[lo] == 0){
                tmp = nums[cur];
                nums[cur++] = nums[lo];
                nums[lo++] = tmp;
            }else if(nums[cur] == 2){
                tmp = nums[cur];
                nums[cur] = nums[hi];
                nums[hi--] = tmp;
            }else{
                lo ++;
            }
        }
        
    }
}