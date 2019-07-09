func twoSum(nums []int, target int) []int {
	lo, hi := 0, len(nums)-1
	for lo < hi {
		if nums[lo]+nums[hi] == target {
			return []int{lo + 1, hi + 1}
		} else if nums[lo]+nums[hi] < target {
			lo++
		} else {
			hi--
		}
	}
	return []int{}
}