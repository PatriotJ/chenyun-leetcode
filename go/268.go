func missingNumber(nums []int) int {
	l := len(nums)
	for i, v := range nums {
		l ^= i
		l ^= v
	}
	return l
}