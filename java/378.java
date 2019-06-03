class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int l = matrix[0].length;
        int lo = matrix[0][0],hi = matrix[l-1][l-1];
        while(lo < hi){
            int mid = (lo+hi)/2;
            int count = getCount(matrix,mid);
            if(count < k){
                lo = mid + 1;
            }else{
                hi = mid;
            }
        }
        return lo;
    }
    
    
    public int getCount(int[][] matrix,int target){
        int i = matrix[0].length-1;
        int j = 0;
        int c = 0;
        while(i >= 0 && j < matrix.length){
            if(matrix[i][j] <= target ){
                c += i+1;
                j++;
            }else{
                i--;
            }
        }
        return c;
    }
}