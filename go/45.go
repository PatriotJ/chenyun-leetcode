func jump(nums []int) int {
	var start = 0
	var end = 0
	var l = len(nums)
	var ans = 0
	for end < l-1 {
		ans++
		tmp := end
		for i := start; i <= end; i++ {
			if i+nums[i] > tmp {
				tmp = i + nums[i]
				start = i
			}
		}
		end = tmp

	}
	return ans
}