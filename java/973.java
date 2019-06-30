class Solution {
    public int[][] kClosest(int[][] points, int K) {
        Arrays.sort(points,new Comparator<int[]>(){
            public int compare(int[]A,int[]B){
                int i = Math.abs(A[0]),j = Math.abs(A[1]);
                int k = Math.abs(B[0]),v = Math.abs(B[1]);
                return i*i+j*j-k*k-v*v;
            }
        });
        return Arrays.copyOfRange(points,0,K);
    }
}