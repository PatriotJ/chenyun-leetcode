class Solution {
    public List<List<Integer>> getFactors(int n) {
        LinkedList<List<Integer>> ans = dfs(n,2);
        ans.pollLast();
        return ans;
    }
    public LinkedList<List<Integer>> dfs(int n,int lo){
        double hi = Math.sqrt(n);
        LinkedList<List<Integer>> path = new LinkedList();
        // int idx = lo;
        while(lo <= hi){
            if(n % lo == 0 ){
                LinkedList<List<Integer>> lst = dfs(n / lo,lo);
                for(List<Integer> l:lst){
                    l.add(0,lo);
                    path.add(l);
                }
            }
            lo ++;
        }
        List<Integer> list = new LinkedList();
        list.add(n);
        path.add(list);
        return path;
    }
}