class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] S = s.split(" ");
        for(String word:S){
            for(int i = word.length()-1;i>=0;i--){
                sb.append(word.charAt(i));
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}