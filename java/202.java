class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet();
        
        while(n != 1){
            if(set.contains(n)){
                return false;
            }
            set.add(n);
            int k = 0;
            while(n != 0){
                int v = n % 10;
                k += v * v;
                n = n/10;
            }
            n = k;
        }
        return true;
    }
}