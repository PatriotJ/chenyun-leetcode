class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        for(int i = 0;i < matrix.length;i++){
            int lo = 0,hi = matrix[0].length;
            while(lo < hi){
                int mid = (lo+hi)/2;
                if(matrix[i][mid] == target){
                    return true;
                }
                if(matrix[i][mid] < target){
                    lo = mid + 1;
                }else{
                    hi = mid;
                }
            }
        }
        return false;
    }  
}