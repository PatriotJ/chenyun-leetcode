class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList();
        if(numRows == 0){
            return ans;
        }
        List<Integer> l = new ArrayList();
        l.add(1);
        ans.add(l);
        if(numRows == 1){
            return ans;
        }
        
            List<Integer> ll = new ArrayList();
            ll.add(1);
            ll.add(1);
            ans.add(ll);

        for(int i = 2 ;i < numRows ; i++){
            helper(ans,i);
        }
        return ans;
        
    }
    public void helper(List<List<Integer>>ans,int i){
        List<Integer> list = new ArrayList();
        list.add(1);
        List<Integer> l = ans.get(i-1);
        for(int j = 0;j < i;j ++){
            if(j == i - 1){
                list.add(1);
            }
            else{
                list.add(l.get(j)+l.get(j+1));
            }
        }
        ans.add(list);
    }
}