class Solution {
    public boolean judgeSquareSum(int c) {
        HashSet<Long> set = new HashSet();
        long i = 0;
        while(i * i <= c){
            set.add(i * i);
            if(set.contains(c - i * i)){
                return true;
            }
            i ++;
        }
        return false;
    }
}