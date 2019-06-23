class Solution {
    public int countBinarySubstrings(String s) {
        int l = s.length();
        int ans = 0,cur = 0,prev = 0;
        for(int i = 0;i < l;i++){
            if(i == 0){
                cur ++;
            }else{
                if(s.charAt(i) == s.charAt(i-1)){
                    cur ++;
                    if(cur <= prev){
                        ans ++;
                    }
                }else{
                    prev = cur;
                    cur = 1;
                    if(cur <= prev){
                        ans ++;
                    }
                }
            }
        }
        return ans;
    }
}