class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if(s == null){
            return false;
        }
        int l = s.length();
        for(int i = 1;i < l/2+1;i++){
            if(l % i == 0){
                String sub = s.substring(0,i);
                String string = helper(sub,l/i);
                if(string.equals(s)){
                    return true;
                }
            }
            
        }
        return false;
    }
    
    public String helper(String sub, int l){
        StringBuilder s = new StringBuilder();
        for(int i = 0;i < l;i++){
            s.append(sub);
        }
        return s.toString();
    }
}