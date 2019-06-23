class Solution {
    public boolean detectCapitalUse(String word) {
        int l = word.length();
        for(char c : word.toCharArray()){
            if(c >= 'a' && c <= 'z'){
                l --;
            }
        }
        return l == 0 || l == word.length() || (l == 1 && word.charAt(0) >= 'A' && word.charAt(0)<='Z');
    }
}