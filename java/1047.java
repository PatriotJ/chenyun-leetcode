class Solution {
    public String removeDuplicates(String S) {
        Stack<Character> stack = new Stack();
        for(int i = 0;i<S.length();i++){
            if(stack.isEmpty() || stack.peek() != S.charAt(i)) {
				stack.add(S.charAt(i));
			}else {
				stack.pop();
			}
        }
        StringBuilder ans = new StringBuilder();
        for(char c:stack){
            ans.append(c);
        }
    return ans.toString();
    }
}