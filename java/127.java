class Solution {
    Set<String> set = new HashSet();
    int ans = 0;
    String target;
    LinkedList<String> queue =new LinkedList();
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        for(String word:wordList){
            set.add(word);
        }
        if(!set.contains(endWord)){
            return 0;
        }
        queue.add(beginWord);
        int ans = 0;
        while(!queue.isEmpty()){
            ans++;
            int size = queue.size();
            for(int j =0;j < size;j++){
                String word = queue.poll();
                if(word.equals(endWord)){
                    return ans;
                }
                for(String word1:wordList){
                    if(set.contains(word1) && valid(word,word1)){
                        queue.add(word1);
                        set.remove(word1);
                    }
                }
            }
            
        }
        return 0;
    }
    
    public boolean valid(String word1,String word2){
        int a = 0;
        for(int i = 0;i <word1.length();i++){
            if(word1.charAt(i) != word2.charAt(i)){
                a ++;
            }
            if(a > 1){
                return false;
            }
        }
        return true;
    }
}