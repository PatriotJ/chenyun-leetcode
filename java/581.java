class Solution {
    public int findUnsortedSubarray(int[] nums) {
        // int[] newNum = nums.clone();
        // Arrays.sort(newNum);
        // int ans = 0;
        int start = nums.length,end = 0;
        // for(int i = 0;i < nums.length; i++){
        //     if(nums[i] != newNum[i]){
        //         start = Math.min(start,i);
        //         end = Math.max(end,i);
        //     }
        // }
        // return (end-start >= 0) ? end-start+1:0;
        Stack<Integer> stack = new Stack();
        int ans = 0;
        for(int i = 0;i < nums.length;i++){
            while(!stack.isEmpty() && nums[stack.peek()] > nums[i]){
                start = Math.min(start,stack.pop());
            }
            stack.push(i);
        }
        stack.clear();
        for(int i = nums.length-1;i >= 0;i--){
            while(!stack.isEmpty() && nums[stack.peek()] < nums[i]){
                end = Math.max(end,stack.pop());
            }
            stack.push(i);
        }
                return (end-start >= 0) ? end-start+1:0;
    }
}