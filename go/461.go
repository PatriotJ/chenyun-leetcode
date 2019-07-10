func hammingDistance(x int, y int) int {
	j := x ^ y
	ans := 0
	for j != 0 {
		ans += j % 2
		j /= 2
	}
	return ans
}