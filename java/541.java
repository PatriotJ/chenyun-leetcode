class Solution {
    public String reverseStr(String s, int k) {
        char[] c = s.toCharArray();
        for(int i = 0;i < s.length();i += 2 * k){
            int j = i,v = Math.min(i+k-1,s.length()-1);
            while(j <v){
                char tmp = c[j];
                c[j++] = c[v];
                c[v--] = tmp;
            }
        }
        return new String(c);
    }
}