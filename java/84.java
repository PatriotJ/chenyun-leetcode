class Solution {
    public int largestRectangleArea(int[] heights) {
        int l = heights.length;
        if(l == 0){
            return 0;
        }
        int ans = heights[0];
        Stack<Integer> stack = new Stack();
        stack.add(-1);
        for(int i = 0;i < l;i++){
            while(stack.peek() != -1 && heights[stack.peek()] >= heights[i]){
                int k = stack.pop();
                ans = Math.max(ans,heights[k]*(i-stack.peek()-1));
            }
            stack.add(i);
        }
        while(stack.peek() != -1){
            int k = stack.pop();
            
            ans = Math.max(ans,heights[k]*(l-stack.peek()-1));
        }
        return ans;
    }
}