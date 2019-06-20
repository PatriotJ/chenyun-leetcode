class Vector2D {
    LinkedList<Integer> queue = new LinkedList();
    public Vector2D(int[][] v) {
        int m = v.length;
        if(m == 0){
            return;
        }
        for(int i = 0;i < m;i++){
            for(int num:v[i]){
                queue.add(num);
            }
        }
    }
    
    public int next() {
        return queue.poll();
    }
    
    public boolean hasNext() {
        return queue.size() != 0;
    }
}

/**
 * Your Vector2D object will be instantiated and called as such:
 * Vector2D obj = new Vector2D(v);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */