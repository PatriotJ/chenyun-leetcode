func containsDuplicate(nums []int) bool {
	numsMap := make(map[int]int)
	for _, num := range nums {
		_, ok := numsMap[num]
		if ok {
			return true
		} else {
			numsMap[num] = 1
		}
	}
	return false
}