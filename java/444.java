class Solution {
    public boolean sequenceReconstruction(int[] org, List<List<Integer>> seqs) {
        Map<Integer,Set<Integer>> map = new HashMap();
        LinkedList<Integer> queue = new LinkedList();
        LinkedList<Integer> stack = new LinkedList();
        HashMap<Integer,Integer> indegree = new HashMap();
        for(List<Integer> seq:seqs){
            if(seq.size() == 1){
                indegree.put(seq.get(0),0);
            }
            for(int i = 0;i<seq.size()-1;i++){
                int q = seq.get(i);
                int p = seq.get(i+1);
                indegree.put(q,0);
                indegree.put(p,0);
                Set<Integer> set = map.getOrDefault(q,new HashSet());
                set.add(p);
                map.put(q,set);
            }
            
        }
        if(org.length != indegree.size()){
            return false;
        }
        int zero = 0;
        for(int k:map.keySet()){
            for(int u:map.get(k)){
                int v = indegree.get(u);
                indegree.put(u,v+1);
            }
        }
        for(int k : indegree.keySet()){
            if(indegree.get(k) == 0){
                zero ++;
                queue.add(k);
                if(zero > 1){
                    return false;
                }
            }
        }
        while(queue.size() != 0){
            int k = queue.poll();
            zero --;
            stack.add(k);
            if(map.containsKey(k)){
                for(int u:map.get(k)){
                    int v = indegree.get(u);
                    indegree.put(u,v-1);
                    if(v - 1 == 0){
                        queue.add(u);
                        zero ++;
                        if(zero > 1){
                            return false;
                        }
                    }
                }
            }
        }
        return stack.size() == org.length;
    }
}