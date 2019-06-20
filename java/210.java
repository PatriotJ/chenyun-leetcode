class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Map<Integer,Set<Integer>> map = new HashMap();
        LinkedList<Integer> queue = new LinkedList();
        LinkedList<Integer> stack = new LinkedList();
        for(int[] req : prerequisites){
            int p = req[0];
            int q = req[1];
            Set<Integer> set = map.getOrDefault(q,new HashSet());
            set.add(p);
            map.put(q,set);
        }
        int[] indegree = new int[numCourses];
        for(int[] req : prerequisites){
            indegree[req[0]]++;   
        }
        for(int i = 0;i < numCourses ; i++){
            if(indegree[i] == 0){
                queue.add(i);
            }
        }
        while(queue.size() != 0){
            int u = queue.poll();
            stack.add(u);
            if(map.containsKey(u)){
                for(Integer k:map.get(u)){
                    indegree[k] --;
                    if(indegree[k] == 0){
                        queue.add(k);
                    }
                }
            }
        }
        if(stack.size() != numCourses){
            return new int[0];
        }
        int[] ans = new int[numCourses];
        for(int i = 0;i<numCourses;i++){
            ans[i] = stack.poll();
        }
        return ans;
    }
}