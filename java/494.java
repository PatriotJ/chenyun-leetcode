class Solution {
    public int findTargetSumWays(int[] nums, int S) {
        int[][] memo = new int[nums.length][2001];
        return calc(nums,0,0,S,memo);
    }
    public int calc(int[] nums,int sum, int i, int S, int[][] memo){
        if(i == nums.length){
            if(sum == S){
                return 1;
            }else{
                return 0;
            }
        }else{
            int add = calc(nums,sum+nums[i],i+1,S,memo);
            int sub = calc(nums,sum-nums[i],i+1,S,memo);
            memo[i][sum+1000] = add+sub;
            return memo[i][sum+1000];
        }
    }
}