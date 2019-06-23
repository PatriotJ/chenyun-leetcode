class Solution {
    
    public String convertToBase7(int num) {
        String s = "";
        int pos = 1;
        if(num == 0){
            return "0";
        }
        if(num < 0){
            pos = 0;
            num *= -1;
        }
        while(num != 0){
            int k = num % 7;
            s = k + s;
            num = num /7;
        }
        if(pos == 1){
            return s;
        }else{
            return "-"+s;
        }
        
    }
}