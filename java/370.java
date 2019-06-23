class Solution {
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] ans = new int[length];
        for(int[] update:updates){
            int lo = update[0],hi = update[1],val = update[2];
            ans[hi] += val;
            if(lo > 0){
                ans[lo-1] -= val;
            }
        }
        for(int i = length-2; i >= 0;i--){
            ans[i] += ans[i+1];
        }
        return ans;
    }
}