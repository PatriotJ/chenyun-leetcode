class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for(int num : A){
            sum += num;
        }
        if(sum % 3 != 0){
            return false;
        }
        int freq = 0;
        int subsum = 0;
        for(int num: A){
            subsum += num;
            if(subsum == sum / 3){
                freq ++;
                subsum = 0;
            }
        }
        return freq == 3;
    }
}