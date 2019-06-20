class Solution {
    List<List<Integer>> ans = new ArrayList();
    public List<List<Integer>> combinationSum3(int k, int n) {
        dfs(new ArrayList(),0,k,n);
        return ans;
    }
    public void dfs(List<Integer>list, int pos,int remain, int target){
        if(remain == 0 && target != 0 || remain > 0 && target <= 0){
            return;
        }
        if(remain == 0 && target == 0){
            ans.add(list);
        }
        for(int k = pos + 1;k < 10;k ++){
            ArrayList<Integer> tp = new ArrayList(list);
            tp.add(k);
            dfs(tp,k,remain-1,target -k );
        }
    }  
}