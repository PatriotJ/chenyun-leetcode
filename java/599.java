class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> res1 = new HashMap();
        Map<String,Integer> res2 = new HashMap();
        for(int i = 0;i < list1.length;i++){
            res1.put(list1[i],i);
        }
        for(int i = 0;i < list2.length;i++){
            res2.put(list2[i],i);
        }
        int mini = Integer.MAX_VALUE;
        for(String key:res1.keySet()){
            if(res2.containsKey(key)){
                mini = Math.min(res1.get(key)+res2.get(key),mini);
            }
        }
        ArrayList<String> ans = new ArrayList();
        for(String key:res1.keySet()){
            if(res2.containsKey(key) && res1.get(key)+res2.get(key) == mini){
                ans.add(key);
            }
        }
        return ans.toArray(new String[ans.size()]);
    }
}