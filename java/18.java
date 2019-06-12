class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet();
        Arrays.sort(nums);
        int l = nums.length;
        if(l < 4){
            return new ArrayList();
        }
        for(int i = 0; i < l - 3; i ++){
            if(i != 0 && nums[i] == nums[i - 1]){
                continue;
            }
            for(int j = i + 1; j < l - 2;j ++){
                if( j != i + 1 && nums[j] == nums[j - 1]){
                    continue;
                }
                int lo = j + 1;
                int hi = l - 1;
                while(lo < hi){
                    int sum = nums[i] + nums[lo] + nums[hi] + nums[j];
                    if(sum == target){
                        List<Integer> list = new ArrayList();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[lo]);
                        list.add(nums[hi]);
                        set.add(list);
                        while( lo < hi && nums[lo + 1] == nums[lo]){
                            lo ++;
                        }
                        lo ++;
                        while(lo < hi && nums[hi - 1] == nums[hi]){
                            hi --;
                        }
                        hi --;
                    }else if(sum < target){
                        lo ++;
                    }else{
                        hi -- ;
                    }
                }
            }
        }
        return new ArrayList(set);
    }
}