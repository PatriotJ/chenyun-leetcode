class Solution {
    Stack<Integer>stack = new Stack();
    Stack<Integer> day = new Stack();
    public int[] dailyTemperatures(int[] T) {
        int l = T.length;
        int[] ans = new int[l];
        for(int i = 0; i < l;i++){
            int d = i;
            while(!stack.empty() && stack.peek() < T[i]){
                stack.pop();
                d = day.pop();
                ans[d] = i - d;
            }
            ans[d] = i - d;
            stack.add(T[i]);
            day.add(i);
        }
        return ans;
    }
}