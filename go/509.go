func fib(N int) int {
	if N <= 1 {
		return N
	}
	first := 0
	second := 1
	for i := 1; i < N; i++ {
		thrid := first + second
		first = second
		second = thrid
	}
	return second
}