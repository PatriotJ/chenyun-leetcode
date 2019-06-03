class MyLinkedList {

    class Node{
        int val;
        Node next;
        Node prev;
        public Node(int val){
            this.val = val;
        }
    }
    Node head;
    Node tail;
    int size;
    /** Initialize your data structure here. */
    public MyLinkedList() {
        head = new Node(-1);
        tail = new Node(-1);
        head.next = tail;
        tail.prev = head;
        // head = null;
        size = 0;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index >= size || index < 0){
            return -1;
        }
        Node cur = head;
        while(index > 0){
            cur = cur.next;
            index--;
        }
        return cur.next.val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node cur = new Node(val);
        Node n = head.next;
        cur.next = n;
        head.next = cur;
        cur.prev = head;
        n.prev = cur;
        size ++;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node node = new Node(val);
        Node p = tail.prev;
        node.next = tail;
        tail.prev = node;
        p.next = node;
        node.prev = p;
        size ++;
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        Node node = new Node(val);
        Node cur = head;
        if(index <= 0){
            addAtHead(val);
            return;
        }else if(index <= size && index > 0){
            while(index > 0){
                cur = cur.next;
                index --;
            }
            Node n = cur.next;
            node.next = n;
            n.prev = node;
            cur.next = node;
            node.prev = cur;
            // node.next = cur.next;
            // cur.next = node;
            size ++;
        }
        
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index < size && index >= 0){
            if(index == 0){
                head = head.next;
                index --;
            }else{
                Node cur = head;
                while(index > 0){
                    cur = cur.next;
                    index--;
                }
                Node n = cur.next.next;
                cur.next = n;
                n.prev = cur;
                size--;
            }
            
        }
    }
}