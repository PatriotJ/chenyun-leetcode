class Solution {
    // public int longestOnes(int[] A, int K) {
    //     int l = A.length;
    //     int ans = 0;
    //     int last = 0;
        
    //     for(int i = 0;i < l;i++){
    //         if(A[i] == 0){
    //             K --;
    //         }
    //         while(K < 0){
    //             if(A[last] == 0){
    //                 K ++;
    //             }
    //             last ++;
    //         }
    //         ans = Math.max(i-last+1,ans);
    //     }
    //     return ans;
    // }
    public int longestOnes(int[] A, int K) {
        int l = A.length;
        int ans = 0;
        int left = 0,right = 0;
        while(left < l && right < l){
            if(A[right] == 1){
                right ++;
            }
            else if(A[right] == 0){
                right ++;
                K --;
            }
            while(K < 0){
                if(A[left] == 0){
                    K++;
                }
                left ++;
            }
            ans = Math.max(right-left,ans);
        }
        return ans;
    }
}