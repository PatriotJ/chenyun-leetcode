class MyCircularDeque {
    class Node{
        int val;
        Node next;
        Node prev;
        public Node(int val){
            this.val = val;
        }
    }
    int size;
    int cur;
    Node first;
    Node last;
    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        size = k;
        cur = 0;
        first = new Node(0);
        last = new Node(0);
        first.next = last;
        last.prev = first;
    }
    
    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if(cur < size){
            Node node = new Node(value);
            Node next = first.next;
            node.next = next;
            next.prev = node;
            first.next = node;
            node.prev = first;
            cur ++;
            return true;
        }
        return false;
    }
    
    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if(cur < size){
            Node node = new Node(value);
            Node prev = last.prev;
            prev.next = node;
            node.prev = prev;
            node.next = last;
            last.prev = node;
            cur ++;
            return true;
        }
        return false;
    }
    
    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if(cur > 0){
            Node next = first.next.next;
            next.prev = first;
            first.next = next;
            cur --;
            return true;
        }
        return false;
    }
    
    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if(cur > 0){
            Node prev = last.prev.prev;
            prev.next = last;
            last.prev = prev;
            cur --;
            return true;
        }
        return false;
    }
    
    /** Get the front item from the deque. */
    public int getFront() {
        if(cur > 0){
            return first.next.val;
        }
        return -1;
    }
    
    /** Get the last item from the deque. */
    public int getRear() {
        if(cur > 0){
            return last.prev.val;
        }
        return -1;
    }
    
    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return cur == 0;
    }
    
    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return cur == size;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */