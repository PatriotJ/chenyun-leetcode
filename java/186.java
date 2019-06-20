class Solution {
    public void reverseWords(char[] s) {
        int l = s.length;
        int lo = 0, hi = l-1;
        while(lo < hi){
            char c = s[lo];
            s[lo] = s[hi];
            s[hi] = c;
            lo ++;
            hi --;
        }
        int le = 0, r = 0;
        while(r < l){
            while(r < l && s[r] != ' '){
                r ++;
            }
            lo = le;
            hi = r -1;
            r ++;
            le = r;
            while(lo < hi){
                char c = s[lo];
                s[lo] = s[hi];
                s[hi] = c;
                lo ++;
                hi --;
            }
        }
    }
}