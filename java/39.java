class Solution {
    List<List<Integer>> ans =new LinkedList();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        dfs(candidates,0,new LinkedList(),target);
        return ans;
    }
    public void dfs(int[] cand,int pos,LinkedList<Integer> sum,int remain){
        if(remain < 0){
            return;
        }else if(remain == 0){
            ans.add(new LinkedList(sum));
            return;
        }
        for(int i = pos;i < cand.length;i++){
            sum.add(cand[i]);
            dfs(cand,i,sum,remain-cand[i]);
            sum.pollLast();
        }
    }
}