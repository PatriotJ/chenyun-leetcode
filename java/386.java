class Solution {
    public List<Integer> lexicalOrder(int n) {
        ArrayList<Integer> list = new ArrayList();
        dfs(list,0,n);
        return list;
    }
    
    public void dfs(List<Integer>list,int cur,int n){
        for(int i = 0;i < 10 && cur <= n;i++,cur++){
            if(cur == 0){
                continue;
            }
            list.add(cur);
            dfs(list,cur*10,n);
        }
    }
}