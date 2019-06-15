class Solution {
    public int missingNumber(int[] nums) {
        int l = nums.length;
        int k = 0;
        for(int i = 1;i <= l;i++){
            k ^= i;
        }
        for(int num:nums){
            k ^= num;
        }
        return k;
    }
}