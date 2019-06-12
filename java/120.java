class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int l = triangle.size();
        if(l == 0){
            return 0;
        }
        int[] res = new int[l];
        for(int i = 0 ; i < l ;i ++){
            res[i] = triangle.get(l-1).get(i);
        }
        for(int i = l-2;i>=0;i--){
            for(int j = 0;j < i+1; j ++){
                res[j] = Math.min(res[j],res[j+1]) + triangle.get(i).get(j);
            }
        }
        return res[0];
    }
}