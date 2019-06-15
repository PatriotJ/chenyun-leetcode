class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int even = 0;
        // int odd = 0;
        for(int i = 0;i<A.length;i++){
            if(A[i]%2 == 0){
                even += A[i];
            }
        }
        int[] ans = new int[queries.length];
        int i = 0;
        for(int[] query:queries){
            int a = query[0],b = query[1];
            
            if(a % 2 != 0 && A[b] % 2 != 0){
                A[b] += a;
                even += A[b];
                
            }else if(a % 2 == 0 && A[b] % 2 != 0){
                // odd += a;
                A[b] += a;
            }else if(a % 2 != 0 && A[b] % 2 == 0){
                even -= A[b];
                A[b] += a;
            }else{
                A[b] += a;
                even += a;
                 
            }
            ans[i++] =even;
        }
        return ans;
        
    }
}