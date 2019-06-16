class Solution {
    long first = Long.MIN_VALUE;
    long second = Long.MIN_VALUE;
    long third = Long.MIN_VALUE;
    
    public int thirdMax(int[] nums) {
        int l = nums.length;
        
        if(l < 3){
            int i = nums[0];
            for(int j:nums){
                i = Math.max(i,j);
            }
            return i;
        }
        for(int i:nums){
            if(i > first){
                third = second;
                second = first;
                first = i;
                
            }else if( i < first && i > second ){
                third = second;
                second = i;
            }else if(i < second && i > third){
                third = i;
            }
        }
        return third == Long.MIN_VALUE ? (int)first:(int)third;
    }
}