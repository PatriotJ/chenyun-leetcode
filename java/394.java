class Solution {
    public String decodeString(String s) {
        Stack<String>stack = new Stack();
        Stack<Integer> num = new Stack();
        StringBuilder cur = new StringBuilder();
        int j = 0;
        for(char k:s.toCharArray()){
            if(k == '['){
                num.push(j);
                j = 0;
                stack.push(cur.toString());
                cur = new StringBuilder();
            }else if(k == ']'){
                String S = stack.pop();
                // System.out.println(S);
                int q = num.pop();
                // System.out.println(q);
                String temp = cur.toString();
                cur = new StringBuilder();
                cur.append(S);
                while(q > 0){
                    cur.append(temp);
                    q --;
                }
                // System.out.println("cur = "+cur);
            }else if(k >= '0' && k <= '9'){
                j = j * 10 + k - '0';
                // num.push(j);
            }else{
                cur.append(k);
            }
        }
        return cur.toString();
    }
    
    
}