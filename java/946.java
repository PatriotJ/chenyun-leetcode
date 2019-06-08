class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer>stack = new Stack();
        int i = 0;
        int j = 0;
        while(i < pushed.length && j < popped.length){
            if(stack.empty()){
                stack.push(pushed[i]);
                i ++;
            }else{
                if(stack.peek() == popped[j]){
                    stack.pop();
                    j ++;
                }else{
                    stack.push(pushed[i++]);
                }
            }
        }
        while(j < popped.length){
            if(stack.peek() == popped[j++]){
                stack.pop();
            }else{
                return false;
            }
        }
        return true;
    }
}