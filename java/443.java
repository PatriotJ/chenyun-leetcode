class Solution {
    public int compress(char[] chars) {
        int pos = 0;
        int num = 1;
        for(int i = 0;i <chars.length;i++){
            if(i+1 == chars.length){
                
                    chars[pos++] = chars[i];
                    if(num > 1){
                        for(char c:(""+num).toCharArray()){
                            chars[pos++] = c;
                        }
                    }
                
            }else{
                if(chars[i] == chars[i+1]){
                    num ++;
                }else{
                    chars[pos++] = chars[i];
                    if(num > 1){
                        for(char c:(""+num).toCharArray()){
                            chars[pos++] = c;
                        }
                    }
                    num = 1;
                }
            }
        }
        return pos;
    }
}