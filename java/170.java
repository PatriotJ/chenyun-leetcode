class TwoSum {
    Map<Integer,Integer> num;
    // Set<Integer> sum;
    /** Initialize your data structure here. */
    public TwoSum() {
        // num = new HashSet();
        // sum = new HashSet();
        num = new HashMap();
    }
    
    /** Add the number to an internal data structure.. */
    public void add(int number) {
        num.put(number,num.getOrDefault(number,0)+1);
    }
    
    /** Find if there exists any pair of numbers which sum is equal to the value. */
    public boolean find(int value) {
        for(int i : num.keySet()){
            if(i * 2 == value){
                if(num.get(i) > 1){
                    return true;
                }
            }
            else{
                if(num.containsKey(value-i)){
                    return true;
                }
            }
        }
        return false;
    }
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */