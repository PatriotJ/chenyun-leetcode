class Solution {
    public boolean isStrobogrammatic(String num) {
        StringBuilder s = new StringBuilder();
        for(int i = num.length()-1;i >= 0;i --){
            char c = num.charAt(i);
            if(c == '1'){
                s.append('1');
            }else if(c == '6'){
                s.append('9');
            }else if(c == '0'){
                s.append('0');
            }else if(c == '8'){
                s.append('8');
            }else if(c == '9'){
                s.append('6');
            }else{
                return false;
            }
        }
        return num.equals(s.toString());
    }
}