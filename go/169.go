func majorityElement(nums []int) int {
	// sort.Ints(nums)
	// return nums[len(nums)/2]
	count := 0
	var cand int
	for _, num := range nums {
		if count == 0 {
			cand = num
		}
		if cand == num {
			count++
		} else {
			count--
		}
	}
	return cand
}