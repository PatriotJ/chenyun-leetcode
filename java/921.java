class Solution {
    public int minAddToMakeValid(String S) {
        Stack<Character> stack = new Stack();
        for(char ch:S.toCharArray()){
            if(ch == '('){
                stack.add(ch);
            }else if(ch == ')'){
                if(stack.empty() || stack.peek() == ')'){
                    stack.add(ch);
                }else{
                    stack.pop();
                }
            }
        }
        return stack.size();
    }
}