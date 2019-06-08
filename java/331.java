class Solution {
    public boolean isValidSerialization(String preorder) {
        String[] ss = preorder.split(",");
        Stack<String> stack = new Stack();
        for(int i = ss.length-1;i >= 0;i--){
            if(!ss[i].equals("#")){
                if(stack.size() < 2)return false;
                stack.pop();
                stack.pop();
               
            }
            stack.push(ss[i]);
        }
        return stack.size() == 1 ;
    }    
}