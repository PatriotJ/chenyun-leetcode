class Solution {
    public String toHex(int num) {
        String s = "";
        if(num == 0){
            return "0";
        }else{
            long n = (long)num;
            if(n < 0){
                
                n += Math.pow(2,32);
            }
            while(n > 0){
                long x = n % 16;
                n /= 16;
                if(x < 10){
                    s = x + s;
                }
                if(x == 10){
                    s = "a" + s;
                }
                if(x == 11){
                    s = "b" + s;
                }
                if(x == 12){
                    s = "c" + s;
                }
                if(x == 13){
                    s = "d" + s;
                }
                if(x == 14){
                    s = "e" + s;
                }
                if(x == 15){
                    s = "f" + s;
                }
            }
            return s;
        }
    }
}