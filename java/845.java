class Solution {
    public int longestMountain(int[] A) {
        int l = A.length,ans = 0,left = 0;
        while(left < l){
            int end = left;
            if(end < l-1 && A[end] < A[end+1]){
                while(end < l-1 && A[end] < A[end+1]){
                    end ++;
                }
                if(end <l-1 && A[end] > A[end+1]){
                    while(end <l-1 && A[end] > A[end+1]){
                        end ++;
                    }
                    ans = Math.max(ans,end-left+1);
                }
                
            }
            left = Math.max(end,left+1);
        }
        return ans;
    }
}