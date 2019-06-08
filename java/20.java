class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for(char ch:s.toCharArray()){
            if(ch == '[' || ch == '(' || ch == '{'){
                stack.add(ch);
            }else{
                if(stack.empty()){
                    return false;
                }
                if(ch == ']' && stack.peek() == '['){
                    stack.pop();
                }
                else if(ch == ')' && stack.peek() == '('){
                    stack.pop();
                }
                else if(ch == '}' && stack.peek() == '{'){
                    stack.pop();
                }else{
                    return false;
                }
                
            }
        }
        return stack.size() == 0;
    }
}