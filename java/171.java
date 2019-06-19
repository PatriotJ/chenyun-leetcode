class Solution {
    public int titleToNumber(String s) {
        int ans = 0;
        if( s == null){
            return ans;
        }
        for(int i = 0; i<s.length();i++){
            ans = ans * 26 + s.charAt(i) - 'A'+1;
        }
        return ans;
    }
}