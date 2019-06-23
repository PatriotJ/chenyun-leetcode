class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map =new HashMap();
        for(String word:words){
            int i = map.getOrDefault(word,0);
            map.put(word,i+1);
        }
        
        List<Map.Entry<String, Integer>> list = new ArrayList(map.entrySet());

        Collections.sort(list,new Comparator<Map.Entry<String, Integer>>(){
            public int compare(Map.Entry<String, Integer> o1,
                    Map.Entry<String, Integer> o2) {
                if(o2.getValue() == o1.getValue()){
                    return o1.getKey().compareTo(o2.getKey());
                }
                return o2.getValue() - (o1.getValue());
            }
        });
        List<String> ans = new ArrayList();
        for(int i = 0;i < k;i++){
            ans.add(list.get(i).getKey());
        }
        return ans;
    }
}