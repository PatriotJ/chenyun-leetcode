class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top = 0,bottom = matrix.length-1;
        int left,right;
        if(bottom < 0){
            return false;
        }
        left = 0;
        right = matrix[0].length-1;
        if(right < 0){
            return false;
        }
        // System.out.println(left+" "+right);
        while(top <= bottom){
            int mid = top + (bottom - top)/2;
            // System.out.println(mid);
            if(matrix[mid][left] <= target && matrix[mid][right] >= target){
                
                while(left <= right){
                    // System.out.println(left+" "+right);
                    int m = (right - left)/2+left;
                    // System.out.println(mid);
                    if(matrix[mid][m] == target){
                        return true;
                    }
                    if(matrix[mid][m] < target){
                        left = m + 1;
                    }else{
                        right = m - 1;
                    }
                }
                return false;
            }
            if(matrix[mid][left] > target){
                bottom = mid - 1;
            }else{
                top = mid + 1;
            }
        }
        return false;
    }
}