class Solution {
    
    public String[] uncommonFromSentences(String A, String B) {
        Map<String,Integer> map = new HashMap();
        for(String word : A.split(" ")){
            int i = map.getOrDefault(word,0);
            map.put(word,i+1);
        }
        for(String word : B.split(" ")){
            int i = map.getOrDefault(word,0);
            map.put(word,i+1);
        }
        List<String> ans  = new ArrayList();
        for(String word:map.keySet()){
            if(map.get(word) == 1){
                ans.add(word);
            }
        }
        return ans.toArray(new String[ans.size()]);
    }
}