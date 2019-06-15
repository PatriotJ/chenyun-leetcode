class Solution {
    public void rotate(int[] nums, int k) {
        int l = nums.length;
        k = k % l;
        reverse(nums,0,l-k-1);
        reverse(nums,l-k,l-1);
        reverse(nums,0,l-1);
        
    }
    
    public void reverse(int[] nums,int l,int r){
        while(l < r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l ++;
            r --;
        }
    }
}