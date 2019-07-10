import "sort"

func maximumProduct(nums []int) int {
	sort.Ints(nums)
	l := len(nums)
	return max(nums[0]*nums[1]*nums[l-1], nums[l-3]*nums[l-2]*nums[l-1])
}

func max(i, j int) int {
	if i > j {
		return i
	}
	return j
}