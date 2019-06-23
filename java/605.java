class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        int ans = 0, l = flowerbed.length;
        if(l == 1){
            return flowerbed[0] == 0 && n <= 1 || flowerbed[0] == 1 && n ==0;
        }
        int num = 0;
        int[] nums = flowerbed.clone();
        for(int i = 0;i < l; i++){
            if(nums[i] == 1){
                continue;
            }
            if(i == 0 && nums[i+1] == 0){
                num ++;
                nums[i] = 1;
            }else if(i == l-1 && nums[i-1] == 0){
                num ++;
            }else if(i > 0 && i < l-1 && nums[i-1] == 0 && nums[i+1] == 0){
                num++;
                nums[i] = 1;
            }
        }
        
        return num >= n;
    }
}