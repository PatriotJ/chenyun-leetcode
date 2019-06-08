class Solution {
    public String removeOuterParentheses(String S) {
        int counter = 0;
        StringBuilder s = new StringBuilder();
        for(int i = 0;i<S.length();i++){
            if(S.charAt(i) == '('){
                if(counter != 0){
                    s.append(S.charAt(i));
                }
                counter ++;
            }
            else if(S.charAt(i) == ')'){
                if(counter > 1){
                    s.append(S.charAt(i));
                }
                counter --;
            }
        }
        return s.toString();
    }
}