class Solution {
    public boolean verifyPreorder(int[] preorder) {
        // Stack<Integer>stack = new Stack();
        // int low = -1;
        // for(int i:preorder){
        //     if(i < low){
        //         return false;
        //     }
        //     while(!stack.empty() && i > stack.peek()){
        //         low = stack.pop();
        //     }
        //     stack.push(i);
        // }
        // return true;
        int i = -1;
        int low = -1;
        for(int num : preorder){
            if(num < low){
                return false;
            }
            while(i > -1 && num > preorder[i]){
                low = preorder[i];
                i -= 1;
            }
            i += 1;
            preorder[i] = num;
        }
        return true;
    }
    
}