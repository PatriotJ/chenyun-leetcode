class HitCounter {
    Map<Integer,Integer> map;
    ArrayList<Integer> array;
    /** Initialize your data structure here. */
    public HitCounter() {
        array = new ArrayList();
        map= new HashMap();
    }
    
    /** Record a hit.
        @param timestamp - The current timestamp (in seconds granularity). */
    public void hit(int timestamp) {
        if(map.containsKey(timestamp)){
            int k =map.get(timestamp);
            map.put(timestamp,k+1);
        }else{
            map.put(timestamp,1);
            array.add(timestamp);
        }
    }
    
    /** Return the number of hits in the past 5 minutes.
        @param timestamp - The current timestamp (in seconds granularity). */
    public int getHits(int timestamp) {
        int l = array.size()-1;
        int ans = 0;
        while(l >= 0 && array.get(l) > timestamp - 300){
            if(timestamp >= array.get(l)){
                ans += map.get(array.get(l));
            }
            l --;
        }
        return ans;
    }
}

/**
 * Your HitCounter object will be instantiated and called as such:
 * HitCounter obj = new HitCounter();
 * obj.hit(timestamp);
 * int param_2 = obj.getHits(timestamp);
 */