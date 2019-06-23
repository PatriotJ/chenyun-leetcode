class Solution {
    public int repeatedStringMatch(String A, String B) {
        int l = A.length(),k = B.length();
        int i = 1;
        String s = "";
        while(i <= k/l+2){
            s += A;
            if(s.lastIndexOf(B) != -1){
                return i;
            }
            i ++;
        }
        
        
        return -1;
    }
}