class Solution {
    public boolean isPalindrome(String s) {
        int lo = 0, hi = s.length()-1;
        while(lo <= hi){
            int c = convert(s.charAt(lo));
            int d = convert(s.charAt(hi));
            if(c == ' '){
                lo ++;
                continue;
            }
            if(d == ' '){
                hi --;
                continue;
            }
            if(c == d){
                lo ++;
                hi --;
            }else{
                return false;
            }
            
        }
        return true;
        // return true;
    }
    
    public int convert(int c){
        if(c >= 'A' && c <= 'Z'){
            c = c + 'a' - 'A';
            return c;
        }
        if( c >= 'a' && c <= 'z' || c>='0' && c <= '9' ){
            return c; 
        }
        else{
            return ' ';
        }
    }
}