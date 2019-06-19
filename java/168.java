class Solution {
    public String convertToTitle(int n) {
        String s = "";
        while(n > 0){
            int x = n % 26 != 0 ? n % 26 : n % 26 +26;
            char c = (char)(x+'A'-1);
            s = c + s;
            n = x == 26 ? n/26-1 : n/26;
        }
        return s;
    }
}