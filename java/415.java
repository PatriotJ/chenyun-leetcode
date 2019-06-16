class Solution {
    public String addStrings(String num1, String num2) {
        String s = "";
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        while(i >= 0 && j >=0 ){
            int x = carry + num1.charAt(i--) + num2.charAt(j--) - '0' - '0';
            carry = x / 10;
            s = x % 10 + s;
        }
        while(i >= 0){
            int x = carry + num1.charAt(i--)  - '0';
            carry = x / 10;
            s = x % 10 + s;
        }
        while(j >= 0){
            int x = carry + num2.charAt(j--)  - '0';
            carry = x / 10;
            s = x %10 + s;
        }
        if(carry == 1){
            s = 1 + s;
        }
        return s;
    }
}