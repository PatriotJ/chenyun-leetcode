class Solution {
    public String decodeAtIndex(String S, int K) {
        long size = 0;
        for(char c:S.toCharArray()){
            if(c >= '0' && c <= '9'){
                size = size * (c - '0');
            }else{
                size ++;
            }
        }
        for(int i = S.length()-1;i>=0;i--){
            K %= size;
            char c = S.charAt(i);
            if(K == 0 && c >= 'a' && c <= 'z'){
                return Character.toString(c);
            }
            if (Character.isDigit(c)){
                size /= c - '0';
            }
            else{
                size--;
            }
        }
        return null;
    }
}