class Solution {
    // int ans = Integer.MIN_VALUE;
    public int maxRotateFunction(int[] A) {
        int l = A.length;
        int allSum = 0,sum = 0;
        for(int i = 0;i < l;i++){
            sum += i*A[i];
            allSum += A[i];
        }
        int max =sum;
        for(int i = l-1;i >= 0;i--){
            sum = sum + allSum - l * A[i];
            max= Math.max(max,sum);
        }
        return max;
    }
    
}