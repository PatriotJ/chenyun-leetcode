class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> list = new HashSet();
        Arrays.sort(nums);
        int l = nums.length;
        for(int i = 0; i < l - 2; i++){
            if(i != 0 && nums[i] == nums[i-1]){
                continue;
            }
            int lo = i + 1;
            int hi = l-1;
            while(lo < hi){
                int k = nums[i] + nums[lo] + nums[hi];
                if(k == 0){
                    List<Integer> ll = new ArrayList();
                    ll.add(nums[i]);
                    ll.add(nums[lo]);
                    ll.add(nums[hi]);
                    list.add(ll);
                    lo ++;
                    hi --;
                }else if(k < 0){
                    lo ++;
                }else{
                    hi --;
                }
                    
            }
            }
            
        
        return new ArrayList(list);
    }
}