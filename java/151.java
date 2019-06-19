class Solution {
    public String reverseWords(String s) {
        // s = s.trim();
        String[] S = s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();
        // System.out.println(s + " " + S.length);
        for(int i = S.length-1;i >= 0;i--){
            if(i == 0){
                ans.append(S[i]);
            }else{
                ans.append(S[i]);
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}