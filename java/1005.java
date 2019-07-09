class Solution {
    public int largestSumAfterKNegations(int[] A, int K) {
        PriorityQueue<Integer>pq = new PriorityQueue();
        for(int a:A){
            pq.add(a);
        }
        for(int i = 0;i < K;i++){
            int x = pq.poll();
            pq.add(-1*x);
        }
        int ans = 0;
        while(pq.size()!=0){
            ans += pq.poll();
        }
        return ans;
    }
}