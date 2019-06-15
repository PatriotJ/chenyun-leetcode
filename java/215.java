class Solution {
    public int findKthLargest(int[] nums, int k) {
        int l = nums.length;
        return quick(0,l-1,l-k,nums);
    }
    public void swap(int[] nums,int k,int i){
        int temp = nums[k];
        nums[k] = nums[i];
        nums[i] = temp;
    }
    
    public int part(int[] nums,int left,int right){
        
        int p = new Random().nextInt(right - left) + left;
        int pivot = nums[p];
        swap(nums,p,right);
        int store = left;
        for(int i = left; i <= right;i ++){
            if(nums[i] < pivot){
                swap(nums,store,i);
                store++;
            }
        }
        swap(nums,store,right);
        return store;
    }
    
    public int quick(int left,int right,int k,int[] nums){
        if(left == right){
            return nums[left];
        }
        int pivot = part(nums,left,right);
        if(k == pivot){
            return nums[k];
        }else if(k < pivot){
            return quick(left,pivot-1,k,nums);
        }else{
            return quick(pivot+1,right,k,nums);
        }
    }
}