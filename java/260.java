class Solution {
    public int[] singleNumber(int[] nums) {
        int k = 0;
        for(int num:nums){
            k ^= num;
        }
        k &= ~(k-1);
        int[] res = new int[2];
        for(int num:nums){
            if((num&k) == 0){
                res[0] ^= num;
            }else{
                res[1] ^= num;
            }
        }
        return res;
        
    }
}