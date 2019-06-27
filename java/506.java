class Solution {
    public String[] findRelativeRanks(int[] nums) {
        int[] newNum = nums.clone();
        int l = nums.length;
        Arrays.sort(newNum);
        Map<Integer,Integer>map = new HashMap();
        for(int i = 0;i < nums.length;i++){
            map.put(newNum[i],l-i-1);
        }
        String[] ans = new String[nums.length];
        for(int i = 0;i < nums.length;i++){
            if(map.get(nums[i]) == 0){
                ans[i] = "Gold Medal";
            }else if(map.get(nums[i]) == 1){
                ans[i] = "Silver Medal";
            }else if(map.get(nums[i]) == 2){
                ans[i] = "Bronze Medal";
            }else{
                ans[i] = (map.get(nums[i])+1) + "";
            }
        }
        return ans;
    }
}