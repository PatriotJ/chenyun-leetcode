// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
class PeekingIterator implements Iterator<Integer> {
    LinkedList<Integer> ans = new LinkedList();
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    while(iterator.hasNext()){
            ans.add(iterator.next());
        }
	}

    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if(ans.size() != 0){
            return ans.get(0);
        }
        return -1;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    if(ans.size() != 0){
            return ans.poll();
        }
        return -1;
	}

	@Override
	public boolean hasNext() {
	    return ans.size() != 0;
	}
}