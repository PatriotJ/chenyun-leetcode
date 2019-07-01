class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map = new HashMap();
        for(int n:nums){
             map.put(n,map.getOrDefault(n,0)+1);
        }
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>((n1,n2)->map.get(n1)-map.get(n2));
        for(int n:map.keySet()){
            heap.add(n);
            if(heap.size()>k){
                heap.poll();
            }
        }
        List<Integer> ans  = new ArrayList();
        while(!heap.isEmpty()){
            ans.add(heap.poll());
        }
        Collections.reverse(ans);
        return ans;
    }
}