class Solution {
    public boolean isPowerOfThree(int n) {
        if(n <= 0){
            return false;
        }
        int a = 1162261467;
        return a % n == 0;
    }
}