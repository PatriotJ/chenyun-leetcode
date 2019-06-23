class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap();
        for(String str:strs){
            String o = ori(str);
            ArrayList<String> arr = map.getOrDefault(o,new ArrayList());
            arr.add(str);
            map.put(o,arr);
        }
        List<List<String>> ans = new ArrayList();
        for(ArrayList<String> arr:map.values()){
            ans.add(arr);
        }
        return ans;
    }
    
    public String ori(String word){
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}