class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> ban = new HashSet();
        for(String word :banned){
            ban.add(word.toLowerCase());
        }
        int max = 0;
        HashMap<String,Integer>map = new HashMap();
        String[] words = paragraph.split("[^a-zA-Z0-9]");
        for(String word:words){
            String w = word.toLowerCase();
            if(w.equals("")){
                continue;
            }
            if(!ban.contains(w)){
                int k = map.getOrDefault(w,0);
                map.put(w,k+1);
                max = Math.max(max,k+1);
            }
        }
        for(String word:map.keySet()){
            if(map.get(word) == max){
                return word;
            }
        }
        return null;
    }
}