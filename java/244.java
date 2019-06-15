class WordDistance {
    Map<String,ArrayList<Integer>> map;
    public WordDistance(String[] words) {
        map = new HashMap();
        for(int i = 0;i < words.length; i ++){
            ArrayList<Integer> list = map.getOrDefault(words[i],new ArrayList());
            list.add(i);
            map.put(words[i],list);
        }
    }
    
    public int shortest(String word1, String word2) {
        ArrayList<Integer> loc1 = map.get(word1),loc2 = map.get(word2);
        int ans = Integer.MAX_VALUE;
        int i = 0,j = 0;
        while(i < loc1.size() && j < loc2.size()){
            ans = Math.min(ans, Math.abs(loc1.get(i) - loc2.get(j)));
            if (loc1.get(i) < loc2.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return ans;
    }
}

/**
 * Your WordDistance object will be instantiated and called as such:
 * WordDistance obj = new WordDistance(words);
 * int param_1 = obj.shortest(word1,word2);
 */