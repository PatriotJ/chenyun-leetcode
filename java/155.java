class MinStack {
    Stack<Integer> stack;
    Stack<Integer> min;
    /** initialize your data structure here. */
    public MinStack() {
        this.stack = new Stack();
        this.min = new Stack();
    }
    
    public void push(int x) {
        if(stack.empty()){
            stack.push(x);
            min.push(x);
        }else{
            int y = min.peek();
            stack.push(x);
            min.push(Math.min(x,y));
        }
    }
    
    public void pop() {
        stack.pop();
        min.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */