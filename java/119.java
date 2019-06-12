class Solution {

    public List<Integer> getRow2(int rowIndex) {
        List<Integer> ans = new ArrayList();
        if(rowIndex == 0){
            ans.add(1);
            return ans;
        }
        long k = 1;
        ans.add((int)k);
        for(int i = 0;i < rowIndex ; i++){
            k *= (rowIndex-i);
            k /= (i+1);
            
            ans.add( (int)k);                
            }
        return ans;    
    }

    public List<Integer> getRow(int numRows) {
        List<List<Integer>> ans = new ArrayList();
        // if(numRows == 0){
        //     return new ArrayList();
        // }
        List<Integer> l = new ArrayList();
        l.add(1);
        ans.add(l);
        if(numRows == 0){
            return ans.get(0);
        }
        
            List<Integer> ll = new ArrayList();
            ll.add(1);
            ll.add(1);
            ans.add(ll);

        for(int i = 2 ;i < numRows+1 ; i++){
            helper(ans,i);
        }
        return ans.get(numRows);
        
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