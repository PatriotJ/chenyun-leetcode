func trailingZeroes(n int) int {
	ans := 0
	for i := 5; i <= n; i = i * 5 {
		ans += n / i
	}
	return ans
}