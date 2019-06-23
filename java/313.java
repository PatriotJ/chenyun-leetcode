class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        Arrays.sort(primes);
        int[] ans = new int[n];
        ans[0] = 1;
        int[] id = new int[primes.length];
        int[] fac = primes.clone();
        int v = 1;
        while(v < n){
            int min = min(fac);
            ans[v++] = min;
            for(int i = 0;i <primes.length;i++){
                if(min == fac[i]){
                    fac[i] = ans[id[i]+1] * primes[i];
                    id[i] ++;
                }
            }
        }
        return ans[n-1];
    }
    public int min(int[] nums){
        int min = Integer.MAX_VALUE;
        for(int num:nums){
            min = Math.min(num,min);
        }
        return min;
    }
}