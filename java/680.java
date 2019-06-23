class Solution {
    public boolean validPalindrome(String s) {
        int l = s.length();
        for(int i = 0;i < l/2;i++){
            if(s.charAt(i) != s.charAt(l-i-1)){
                int j = l-i-1;
                return helper(s,i,j-1) || helper(s,i+1,j);
            }
        }
        return true;
        
    }
    
    public boolean helper(String s, int i,int j){
        for(int k = i; k <= i + (j-i)/2;k++){
            if(s.charAt(k) != s.charAt(j-k+i)){
                return false;
            }
        }
        return true;
    }
}