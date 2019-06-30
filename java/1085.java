class Solution {
    public int sumOfDigits(int[] A) {
        int min = Integer.MAX_VALUE;
        for(int a:A){
            min = Math.min(a,min);
        }
        int sum = 0;
        while(min > 0){
            sum += min % 10;
            min /= 10;
        }
        return sum % 2 == 0 ? 1 : 0;
    }
}