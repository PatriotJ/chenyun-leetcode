type MyQueue struct {
	enque []int
	// deque []int
}

/** Initialize your data structure here. */
func Constructor() MyQueue {
	return MyQueue{[]int{}}
}

/** Push element x to the back of queue. */
func (this *MyQueue) Push(x int) {
	this.enque = append(this.enque, x)
}

/** Removes the element from in front of queue and returns that element. */
func (this *MyQueue) Pop() int {
	if this.Empty() {
		return -1
	}
	ret := this.enque[0]
	this.enque = this.enque[1:]
	return ret
}

/** Get the front element. */
func (this *MyQueue) Peek() int {
	if this.Empty() {
		return -1
	}
	return this.enque[0]
}

/** Returns whether the queue is empty. */
func (this *MyQueue) Empty() bool {
	return len(this.enque) == 0
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * obj := Constructor();
 * obj.Push(x);
 * param_2 := obj.Pop();
 * param_3 := obj.Peek();
 * param_4 := obj.Empty();
 */