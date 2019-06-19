class Solution {
    public int majorityElement(int[] nums) {
        // sorting is faster in real practise
        // int l = nums.length;
        // Arrays.sort(nums);
        // return nums[l/2];
        int count = 0;
        Integer cand = null;
        for(int num:nums){
            if(count == 0){
                cand = num;
            }
            count += (cand == num) ? 1 : -1;
        }
        return cand;
    }
}