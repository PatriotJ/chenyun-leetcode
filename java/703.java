class KthLargest {
    PriorityQueue<Integer> pq =new PriorityQueue();
    int size;
    public KthLargest(int k, int[] nums) {
        size = k;
        // int i = 0;
        for(int i = 0;i < nums.length;i++){
            if(k > 0){
                pq.add(nums[i]);
                k--;
            }else{
                int v = pq.poll();
                v = Math.max(v,nums[i]);
                pq.add(v);
            }
        }
    }
    
    public int add(int val) {
        pq.add(val);
        if(pq.size() > size){
            pq.poll();
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */