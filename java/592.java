class Solution {
    
    public String fractionAddition(String expression) {
        List<Character> sign = new ArrayList();
        if(expression.charAt(0) != '-'){
            sign.add('+');
        }
        for(char c:expression.toCharArray()){
            if(c == '+' || c == '-'){
                sign.add(c);
            }
        }
        int prev = 0,cur = 1,i = 0;
        String[] fraction = expression.split("(\\+)|(-)");
        for(String frac:fraction){
            if(frac.length() > 0){
                int num = Integer.parseInt(frac.split("/")[0]);
                int den = Integer.parseInt(frac.split("/")[1]);
                int g = Math.abs(gcd(num,den));
                if(sign.get(i++) == '+'){
                    prev = prev * den / g + num * cur /g;
                }else{
                    prev = prev * den / g - num * cur /g;
                }
                cur = cur * den / g;
                g = Math.abs(gcd(prev,cur));
                prev /= g;
                cur /= g;
            }
        }
        return prev + "/" + cur;
    }
    
    public int gcd(int a,int b){
        if(b == 0){
            return a;
        }
        return gcd(b,a%b);
    }
}