class Solution {
    public int largestValsFromLabels(int[] values, int[] labels, int num_wanted, int use_limit) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
            return values[b] - values[a];
        }
        });
        Map<Integer,Integer>map = new HashMap();
        for(int i = 0;i < values.length;i++){
            pq.add(i);
        }
        int ans = 0;
        while(num_wanted > 0 && pq.size() != 0){
            int i = pq.poll();
            int k = map.getOrDefault(labels[i],1);
            if(k <= use_limit){
                ans += values[i];
                num_wanted --;
                map.put(labels[i],k+1);
            }
        }
        return ans;
    }
}