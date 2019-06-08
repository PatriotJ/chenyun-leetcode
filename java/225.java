class MyStack {
    Queue<Integer> q1 ;
    Queue<Integer> q2 ;
    /** Initialize your data structure here. */
    public MyStack() {
        q1 = new LinkedList();
        q2 = new LinkedList();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        if(q2.isEmpty()){
            q1.add(x);
        }else{
            q2.add(x);
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        
        if(q2.isEmpty()){
            while(q1.size() > 1){
                q2.add(q1.poll());
            }
            return q1.poll();
        }else{
            while(q2.size()>1){
                q1.add(q2.poll());
            }
            return q2.poll();
        }
    }
    
    /** Get the top element. */
    public int top() {
        int ret = -1;
        if(q2.isEmpty()){
            while(q1.size() > 0){
                ret = q1.poll();
                q2.add(ret);
            }
            return ret;
        }else{
            while(q2.size() > 0){
                ret = q2.poll();
                q1.add(ret);
            }
            return ret;
        }
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */