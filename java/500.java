class Solution {
    ArrayList<String> ans = new ArrayList();
    HashMap<Character,Integer>map = new HashMap();
    public String[] findWords(String[] words) {
        
        for(char c:"qwertyuiopQWERTYUIOP".toCharArray()){
            map.put(c,0);
        }
        for(char c:"asdfghjklASDFGHJKL".toCharArray()){
            map.put(c,1);
        }
        for(char c:"zxcvbnmZXCVBNM".toCharArray()){
            map.put(c,2);
        }
        for(String word:words){
            add(word);
        }
        return ans.toArray(new String[ans.size()]);
    }
    
    public void add(String word){
        int num = map.get(word.charAt(0));
        for(char c:word.toCharArray()){
            if(map.get(c) != num){
                return;
            }
        }
        ans.add(word);
    }
}