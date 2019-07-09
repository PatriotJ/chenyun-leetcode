func containsNearbyDuplicate(nums []int, k int) bool {
	numsMap := make(map[int]int)
	for i := 0; i < len(nums); i++ {
		value, ok := numsMap[nums[i]]
		if !ok {
			numsMap[nums[i]] = i
		} else {
			if i-value <= k {
				return true
			} else {
				numsMap[nums[i]] = i
			}
		}
	}
	return false
}