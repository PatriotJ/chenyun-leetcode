class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer>stack = new Stack();
        // Map<Integer,Integer> map = new HashMap();
        int[] ans = new int[nums.length];
        for(int i = 2 *nums.length-1; i >= 0; i--){
            while(!stack.empty() && nums[stack.peek()] <= nums[i % nums.length]){
                stack.pop();
            }
            if(stack.empty()){
                ans[i%nums.length] = -1;
            }else{
                ans[i%nums.length] = nums[stack.peek()];
            }
            stack.push(i % nums.length);
        }
        return ans;
    }
}