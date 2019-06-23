class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap();
        Set<Integer> arr = new HashSet();
        int maxf = 0,l = nums.length;
        for(int num:nums){
            int k = map.getOrDefault(num,0);
            maxf = Math.max(maxf,k+1);
            map.put(num,k+1);
        }
        if(maxf <= 1){
            return maxf;
        }
        for(int num:map.keySet()){
            if(map.get(num) == maxf){
                arr.add(num);
            }
        }
        HashMap<Integer,Integer> start = new HashMap();
        for(int i = 0; i< l;i++){
            if(start.getOrDefault(nums[i],-1) == -1 && arr.contains(nums[i])){
                start.put(nums[i],i);
            }
        }
        int ans = l;
        for(int i = l-1;i>=0;i--){
            if(start.containsKey(nums[i])){
                int k = start.get(nums[i]);
                ans = Math.min(i - k + 1,ans);
                start.remove(nums[i]);
            }
        }
        return ans;
        
        
        
    }
}