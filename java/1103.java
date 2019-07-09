class Solution {
    public int[] distributeCandies(int candies, int num) {
        if(num == 1){
            return new int[]{candies};
        }
        int[] ans = new int[num];
        int i = 0,j = 1;
        while(candies - j >= 0){
            ans[i++ % num] += j;
            candies -= j++;
        }
        ans[i % num] += candies;
        return ans;
    }
}