class Solution {
    public int myAtoi(String str) {
        long ans = 0;
        char first = ' ';
        long n = 2147483647;
        boolean notNum = true;
        for(int i = 0; i<str.length();i++){
            char c = str.charAt(i);
            
            if( c >= '0' && c <= '9'){
                ans = ans * 10 + c-'0';
                notNum = false;
                if(ans > n +1 ){
                    break;
                }
            }else if(c == ' '){
                if(notNum == true && first == ' '){
                    continue;
                }else{
                    break;
                }
            }
            else if(notNum == false){
                break;
            }else{
                if(first == ' ' && (c == '+' || c == '-')){
                    first = c;
                }else{
                    break;
                }
            }
        }
        if(first == '-'){
            ans *= -1;
            if(ans < -2147483648){
                return -2147483648;
            }else{
                return (int)ans;
            }
        }
        if(ans > 2147483647){
            return 2147483647;
        }
        return (int)ans;
    }
}