class Solution {
    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        HashMap<Integer,List<Integer>>tree = new HashMap();
        for(int i = 0;i < ppid.size();i++){
            if(ppid.get(i) > 0){
                List<Integer> l = tree.getOrDefault(ppid.get(i),new ArrayList<Integer>());
                l.add(pid.get(i));
                tree.put(ppid.get(i),l);
            }
        }
        List<Integer> ans = new ArrayList();
        ans.add(kill);
        getAllChildren(tree,ans,kill);
        return ans;
    }
    public void getAllChildren(HashMap < Integer, List < Integer >> map, List < Integer > l, int kill) {
        if (map.containsKey(kill))
            for (int id: map.get(kill)) {
                l.add(id);
                getAllChildren(map, l, id);
            }
    }
}