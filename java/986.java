class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        
        List<int[]> list = new ArrayList();
        int i = 0,j = 0;
        while(i < A.length && j < B.length){
            if(A[i][0] > B[j][1]){
                j++;
                continue;
            }
            if(A[i][1] < B[j][0]){
                i++;
                continue;
            }
            int min = Math.max(A[i][0],B[j][0]);
            if(A[i][1] > B[j][1]){
                list.add(new int[]{min,B[j++][1]});
                continue;
            }
            if(A[i][1] < B[j][1]){
                list.add(new int[]{min,A[i++][1]});
                continue;
            }
            list.add(new int[]{min,A[i++][1]});
            j++;
        }
        int[][] ans = new int[list.size()][];
        for(i = 0;i < list.size();i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
    
}