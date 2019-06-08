class Solution {
    public boolean isValid(String S) {
        Stack<Character> stack = new Stack();
        for(char ch:S.toCharArray()){
            stack.add(ch);
            int k = stack.size();
            if(k >= 3 && stack.elementAt(k-1) == 'c' && stack.elementAt(k-2) == 'b'&&stack.elementAt(k-3) == 'a' ){
                stack.pop();
                stack.pop();
                stack.pop();
            }
        }
        // System.out.println(stack.size());x
        return stack.empty();
    }
}