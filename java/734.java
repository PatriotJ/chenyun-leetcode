class Solution {
    public boolean areSentencesSimilar(String[] words1, String[] words2, List<List<String>> pairs) {
        HashSet<String> set = new HashSet();
        for(List<String>pair : pairs){
            set.add(pair.get(0)+"#"+pair.get(1));
        }
        int l = words1.length,l2 = words2.length;
        if(l != l2){
            return false;
        }
        for(int i = 0;i < l;i++){
            if( !words1[i].equals(words2[i]) &&  !set.contains(words1[i]+"#"+words2[i]) && !set.contains(words2[i]+"#"+words1[i])){
                
                return false;
            }
        }
        return true;
        
    }
}