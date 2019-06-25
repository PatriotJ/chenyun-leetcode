class MyCircularQueue {
    class Node{
        int val;
        Node next;
        Node prev;
        public Node(){
            val = -1;
        }
        public Node(int val){
            this.val = val;
        }
    }
    int size;
    Node first = new Node();;
    Node last = new Node();
    int cur;
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        this.cur = 0;
        this.size = k;
        first.next = last;
        first.prev = last;
        last.next = first;
        last.prev = first;
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        Node node = new Node(value);
        if(cur < size){
            cur ++;
            Node lastP = last.prev;
            lastP.next = node;
            node.prev = lastP;
            node.next = last;
            last.prev = node;
            return true;
        }else{
            return false;
        }
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(cur > 0){
            Node node = first.next;
            Node pp = node.next;
            first.next = pp;
            pp.prev = first;
            cur --;
            return true;
        }else{
            return false;
        }
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return first.next.val;
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return last.prev.val;
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return cur == 0;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return cur == size;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */