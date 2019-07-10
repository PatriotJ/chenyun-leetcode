func selfDividingNumbers(left int, right int) []int {
	ans := make([]int, 0)
	for i := left; i <= right; i++ {
		if self(i) {
			ans = append(ans, i)
		}
	}
	return ans
}
func self(i int) bool {

	j := i
	for j > 0 {
		k := j % 10
		if k == 0 || i%k != 0 {
			return false
		}
		j /= 10
	}
	return true
}