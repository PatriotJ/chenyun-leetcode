class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> ans = new ArrayList();
        int l = nums.length;
        long lo = (long)lower;
        long up = (long)upper;
        int i = 0;
        while(i < l && up >= nums[i]){
            if(nums[i] < lo){
                i ++;
            }else if(nums[i] == lo){
                lo ++;
                i ++;
            }else if(nums[i] == lo + 1){
                ans.add(lo+"");
                lo += 2;
                i ++;
            }else{
                ans.add(lo + "->" + (nums[i]-1));
                lo = (long)nums[i]+1;
                i ++;
                
            }
        }
        if(lo < up){
            ans.add(lo + "->" + up);
        }
        if(lo == up){
            ans.add(up + "");
        }
        return ans;
        
    }
}