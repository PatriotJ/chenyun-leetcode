class Solution {
    
    public int shortestWordDistance(String[] words, String word1, String word2) {
        int ans = Integer.MAX_VALUE;
        int p1 = -1, p2 = -1; 
        if(word1.equals(word2)){
             for(int i = 0;i < words.length;i++){
                 if(words[i].equals(word1)){
                     p2 = i;
                     if(p1 != -1){
                         ans = Math.min(p2-p1,ans);
                     }
                     p1 = p2;
                 }
             }
         }else{
            for(int i = 0 ;i < words.length; i++){
            if(words[i].equals(word1)){
                p1 = i;
            }
            if(words[i].equals(word2)){
                p2 = i;
            }
            if(p1 != -1 && p2 != -1){
                ans = Math.min(ans,Math.abs(p1-p2));
            }
        }
        
        }
        return ans;
    }
}