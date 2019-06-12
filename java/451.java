class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer>map = new HashMap();
        for(char c:s.toCharArray()){
            int k = map.getOrDefault(c,0);
            map.put(c,k+1);
        }
        List<Map.Entry<Character,Integer>> list = new ArrayList(map.entrySet());
        list.sort(new Comparator<Map.Entry<Character,Integer>>(){
            public int compare(Map.Entry<Character,Integer> o1, Map.Entry<Character,Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        StringBuilder res = new StringBuilder();
        for(Map.Entry<Character, Integer> map2 : list) {
        	char ch = map2.getKey();
        	int freq = map2.getValue();
        	while(freq-- > 0)
        		res.append(ch);
        }
        return res.toString();
    }
}
