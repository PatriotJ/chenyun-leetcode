class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int lo = 0;
        int hi = numbers.length-1;
        while(lo < hi){
            if(numbers[lo] + numbers[hi] == target){
                ans[0] = lo+1;
                ans[1] = hi+1;
                return ans;
            }
            if(numbers[lo] + numbers[hi] > target){
                hi--;
            }else if(numbers[lo] + numbers[hi] < target){
                lo ++;
            }
        }
        return ans;
    }
}