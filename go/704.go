func search(nums []int, target int) int {
	lo, hi := 0, len(nums)
	for lo < hi {
		mid := (lo + hi) / 2
		if nums[mid] == target {
			return mid
		} else if nums[mid] > target {
			hi = mid
		} else {
			lo = mid + 1
		}
	}
	return -1
}