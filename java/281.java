public class ZigzagIterator {
    LinkedList<Integer> list;
    public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
        list = new LinkedList();
        int i = 0, j = 0;
        while(i < v1.size() && j < v2.size()){
            list.add(v1.get(i++));
            list.add(v2.get(j++));
        }
        while(i < v1.size()){
            list.add(v1.get(i++));
        }
        while(j < v2.size()){
            list.add(v2.get(j++));
        }
    }

    public int next() {
        if(hasNext()){
            return list.poll();
        }
        return -1;
    }

    public boolean hasNext() {
        return list.size() != 0;
    }
}

/**
 * Your ZigzagIterator object will be instantiated and called as such:
 * ZigzagIterator i = new ZigzagIterator(v1, v2);
 * while (i.hasNext()) v[f()] = i.next();
 */