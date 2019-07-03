class Solution {
    List<List<Integer>> ans = new ArrayList();
    Set<Integer> set = new HashSet();
    int target;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        target = graph.length-1;
        List<Integer> path = new ArrayList();
        path.add(0);
        dfs(graph,0,path);
        return ans;
    }
    
    public void dfs(int[][] graph,int pos,List<Integer> path){
        if(pos == target){
            ans.add(path);
        }
        for(int i : graph[pos]){
            if(!set.contains(i)){
                set.add(i);
                List<Integer> tmp = new ArrayList(path);
                tmp.add(i);
                dfs(graph,i,tmp);
                set.remove(i);
            }
        }
    }
}