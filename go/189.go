func rotate(nums []int, k int) {
	l := len(nums)
	k = k % l
	swap(nums, 0, l-1)
	swap(nums, 0, k-1)
	swap(nums, k, l-1)
}

func swap(nums []int, i int, j int) {
	for i <= j {
		tmp := nums[i]
		nums[i] = nums[j]
		nums[j] = tmp
		i++
		j--
	}
}