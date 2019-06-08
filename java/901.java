class StockSpanner {
    int i;
    Stack<Integer>stack;
    Stack<Integer>day;
    public StockSpanner() {
        i = 0;
        day = new Stack();
        stack = new Stack();
    }
    
    public int next(int price) {
            i ++;
            int ans;
            // int k = 0;
            while(!stack.empty() && price >= stack.peek()){
                stack.pop();
                day.pop();
            }
            if(stack.empty()){
                ans = i;
            }else{
                ans = i - day.peek();
            }
            
            stack.add(price);
            day.add(i);
            return ans;
    }
}
