func searchInsert(nums []int, target int) int {
	lo := 0
	hi := len(nums)
	for lo < hi {
		mid := (lo + hi) / 2
		if nums[mid] == target {
			return mid
		}
		if nums[mid] > target {
			hi = mid
		} else {
			lo = mid + 1
		}
	}
	return lo
}