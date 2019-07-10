func minCostClimbingStairs(cost []int) int {
	l := len(cost)
	if l <= 2 {
		return 0
	}
	dp := make([]int, l+1)
	for i := 2; i <= l; i++ {
		dp[i] = min(dp[i-1]+cost[i-1], dp[i-2]+cost[i-2])
	}
	return dp[l]
}

func min(i, j int) int {
	if i < j {
		return i
	}
	return j
}