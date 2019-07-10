class Solution {
    
    public List<List<String>> groupStrings(String[] strings) {
        Map<String,List<String>>map = new HashMap();
        for(String word:strings){
            String uni = helper(word);
            List<String> tmp = map.getOrDefault(uni,new ArrayList<String>());
            tmp.add(word);
            map.put(uni,tmp);
        }
        List<List<String>> ans = new ArrayList();
        for(String key:map.keySet()){
            ans.add(map.get(key));
        }
        return ans;
    }
    
    public String helper(String word){
        StringBuilder sb = new StringBuilder();
        for(int i = 1;i < word.length();i++){
            int k = word.charAt(i)-word.charAt(i-1);
            if(k < 0){
                k += 26;
            }
            sb.append(k);
            sb.append(":");
        }
        return sb.toString();
    }
}