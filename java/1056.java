class Solution {
    public boolean confusingNumber(int N) {
        if(N == 0){
            return false;
        }
            
        StringBuilder s = new StringBuilder();
        int n = N;
        while(n != 0){
            int k = n % 10;
            if(k == 0){
                s.append(0);
            }else if(k == 1){
                s.append(1);
            }else if(k == 6){
                s.append(9);
            }else if(k == 8){
                s.append(8);
            }else if(k == 9){
                s.append(6);
            }else{
                return false;
            }
            n = n /10;
        }
        return Long.valueOf(s.toString()) != (long)N;
    }
}