class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        Set<Integer> set1 = new HashSet();
        Set<Integer> set2 = new HashSet();
        int sum1 = 0,sum2 = 0;
        for(int i:A){
            sum1 += i;
            set1.add(i);
        }
        for(int i : B){
            sum2 += i;
            set2.add(i);
        }
        int diff = sum1 - sum2;
        for(int i : set1){
            if(set2.contains(i - diff/2)){
                return new int[]{i,i-diff/2};
            }
        }
        return new int[0];
    }
}