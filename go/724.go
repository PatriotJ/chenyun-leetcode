func pivotIndex(nums []int) int {
	sum := 0
	for _, v := range nums {
		sum += v
	}
	left := 0
	for i, v := range nums {
		if left*2+v == sum {
			return i
		}
		left += v
	}
	return -1
}