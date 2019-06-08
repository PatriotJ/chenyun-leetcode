class Solution {
    public int scoreOfParentheses(String S) {
        // double ans = 0;
        
        Stack<Integer> stack = new Stack();
        stack.push(0);
        for(char ch:S.toCharArray()){
            if(ch == '('){
                stack.push(0);
            }else{
                int v = stack.pop();
                int w = stack.pop();
                stack.push(w + Math.max(2*v,1));
            }
        }
        return stack.pop();
    }
    public int scoreOfParentheses2t(String S) {
        int ans = 0,bal = 0;
        for(int i = 0;i < S.length();i++){
            if(S.charAt(i) == '('){
                bal ++;
            }else{
                bal --;
                if(S.charAt(i-1) == '('){
                    ans += 1 << bal;
                }
            }
        }
        return ans;
    }
}