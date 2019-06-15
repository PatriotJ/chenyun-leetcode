class Solution {
    public int shortestDistance(String[] words, String word1, String word2) {
        int k = -1;
        int v = -1;
        int ans = words.length;
        // int cur;
        for(int i = 0 ;i < words.length; i++){
            if(words[i].equals(word1)){
                k = i;
            }
            if(words[i].equals(word2)){
                v = i;
            }
            if(k != -1 && v != -1){
                ans = Math.min(ans,Math.abs(k-v));
            }
        }
        return ans;
    }
}