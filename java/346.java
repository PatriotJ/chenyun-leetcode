class MovingAverage {
    LinkedList<Integer> list;
    int i;
    int size;
    int count;
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        list = new LinkedList();
        i = 0;
        this.size = size;
        count = 0;
    }
    
    public double next(int val) {
        if(i < size){
            count += val;
            list.add(val);
            i++;
            return (double)count/i;
        }else{
            count -= list.poll();
            count += val;
            list.add(val);
            return (double)count/i;
        }
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */