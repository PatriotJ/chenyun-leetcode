class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
                return b-a;
            }
        });
        for(int num:stones){
            pq.add(num);
        }
        while(pq.size() > 1){
            int A = pq.poll();
            int B = pq.poll();
            if(A > B){
                pq.add(A-B);
            }
        }
        return pq.size() > 0 ? pq.poll():0;
    }
}