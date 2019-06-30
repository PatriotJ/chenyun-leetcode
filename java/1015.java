class Solution {
    public int smallestRepunitDivByK(int K) {
        class Solution {
            public int smallestRepunitDivByK(int K) {
                if(K % 5 ==0 || K % 2 == 0){
                    return -1;
                }
                int k = 1;
                int i = 1;
                while(k % K != 0){
                    k = 10 * (k % K) + 1;
                    i++;
                }
                return i;
            }
        }
        
    }
}