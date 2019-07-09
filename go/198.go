func rob(nums []int) int {
	l := len(nums)
	if l == 0 {
		return 0
	}
	dp := make([]int, l+1)
	dp[0] = 0
	dp[1] = nums[0]
	for i := 1; i < l; i++ {
		dp[i+1] = max(dp[i], dp[i-1]+nums[i])
	}
	return dp[l]

}
func max(i int, j int) int {
	if i > j {
		return i
	} else {
		return j
	}
}