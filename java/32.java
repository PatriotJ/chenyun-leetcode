class Solution {
    public int longestValidParentheses(String s) {
        int left = 0,right = 0;
        int ans = 0;
        // left scan
        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            if(c == '('){
                left++;
            }else{
                right ++;
            }
            if(left == right){
                ans = Math.max(ans,2 *right);
            }else if(left < right){
                left =0;
                right = 0;
            }
        }
        left = 0;
        right = 0;
        //right scan
        for(int i = s.length()-1;i >= 0;i--){
            char c = s.charAt(i);
            if(c == ')'){
                left++;
            }else{
                right ++;
            }
            if(left == right){
                ans = Math.max(ans,2 *left);
            }else if(left < right){
                left =0;
                right = 0;
            }
        }
        return ans;
    }
}