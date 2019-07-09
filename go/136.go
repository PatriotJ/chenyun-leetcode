func singleNumber(nums []int) int {
	var ans = 0
	for _, num := range nums {
		ans ^= num
	}
	return ans
}