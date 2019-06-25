class Solution {
    
    public List<Integer> grayCode(int n) {
        ArrayList<Integer>ans = new  ArrayList();
        if(n == 0){
            ans.add(0);
            return ans;
        }
        ans.add(0);
        ArrayList<Integer> tmp = new ArrayList(ans);
        int j = 0;
        while(j < n){
                for(int i = tmp.size()-1;i >= 0;i--){
                    ans.add(tmp.get(i) + (int)Math.pow(2,j));
                }
                tmp = new ArrayList(ans);
                

            j ++;
        }
        return ans;
    }
}