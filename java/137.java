class Solution {
    public int singleNumber(int[] nums) {
        int a = 0, b = 0;
        for(int i : nums){
            b = (b ^ i) & ~a;
            // System.out.println(b);
            a = (a ^ i) & ~b;
            // System.out.println(a);
        }
        return b;
    }
}