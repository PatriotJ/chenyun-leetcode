class Solution {
    public String convert(String s, int n) {
        if(n == 1)return s;
        StringBuilder ans = new StringBuilder();
        int l = s.length();
        int c = n * 2 - 2;
        for(int i = 0;i < n;i++){
            for(int j = 0;j + i < l;j += c){
                ans.append(s.charAt(j+i));
                if(i != 0 && i != n - 1 && j + c - i < l){
                    ans.append(s.charAt(j + c - i));
                }
            }
        }
        return ans.toString();
    }
}