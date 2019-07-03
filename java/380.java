class RandomizedSet {
    Map<Integer,Integer>map;
    LinkedList<Integer>list;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        list = new LinkedList();
        map = new HashMap();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }
        int k = list.size();
        list.add(val);
        map.put(val,k);
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(map.containsKey(val)){
            int k = map.get(val);
            int l = list.size()-1;
            int v = list.get(l);
            list.set(l,val);
            list.set(k,v);
            list.pollLast();
            map.put(v,k);
            map.remove(val);
            
            return true;
        }
        return false;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        int k = new Random().nextInt(list.size());
        return list.get(k);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */