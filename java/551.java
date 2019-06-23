class Solution {
    public boolean checkRecord(String s) {
        int l = s.length();
        int A = 0;
        int L = 0;
        for(int i = 0;i< l;i++){
            if(s.charAt(i) == 'A'){
                A ++;
                L = 0;
                if(A > 1){
                    return false;
                }
            }else if(s.charAt(i) == 'L'){
                L += 1;
                if(L > 2){
                    return false;
                }
            }else{
                L = 0;
            }
        }
        return true;
    }
}