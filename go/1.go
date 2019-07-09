
func twoSum(nums []int, target int) []int {
	m := make(map[int]int)
	for i, n := range nums {
		_, num := m[n]
		if num {
			return []int{m[n], i}
		} else {
			m[target-n] = i
		}
	}
	return nil
}
