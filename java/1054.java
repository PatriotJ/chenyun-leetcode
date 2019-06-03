class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {
        Map<Integer,Integer> freq = new HashMap();
        for(int i:barcodes){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue(new Comparator<Map.Entry<Integer,Integer>>() {

			@Override
			public int compare(Map.Entry<Integer, Integer> arg0, Map.Entry<Integer, Integer> arg1) {
				// TODO Auto-generated method stub
				return arg0.getValue() - arg1.getValue();
//				return 0;
			}
			 
		});
        
        pq.addAll(freq.entrySet());
        LinkedList<Integer> list = new LinkedList();
        while(!pq.isEmpty()){
            Map.Entry<Integer,Integer> m = pq.poll();
            for(int i = 0;i<m.getValue();i++){
                list.add(m.getKey());
            }
        }
        int[] ans = new int[barcodes.length];
        for(int i = 0;i<barcodes.length;i += 2){
            ans[i] = list.pollLast();
        }
        for(int i = 1;i<barcodes.length;i+=2){
            ans[i] = list.pollLast();
        }
        return ans;
    }
}