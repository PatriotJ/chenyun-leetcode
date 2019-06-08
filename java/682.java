class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack();
        int ans = 0;
        for(String s:ops){
            if(s.equals("+")){
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            }else if(s.equals("D")){
                int top = 2 * stack.peek();
                stack.push(top);
            }
            else if(s.equals("C")){
                stack.pop();
            }
            else{
                stack.push(Integer.valueOf(s));
            }
        }
        for(int a:stack){
            ans += a;
        }
        return ans;
    }
}