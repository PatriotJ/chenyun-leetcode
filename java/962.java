class Solution {
    public int maxWidthRamp(int[] A) {
        Stack<int[]>stack = new Stack();
        int ans = 0;
        int k = -1;
        for(int i = A.length-1;i >= 0;i--){
            if(A[i] > k){
                k = A[i];
                stack.add(new int[]{A[i],i});
            }
        }
        for(int i = 0;i < A.length;i++){
            while(!stack.empty() && stack.peek()[0] >=A[i]){
                ans = Math.max(ans,stack.pop()[1]-i);
            }
        }
        return ans;
    }
}