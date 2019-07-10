func shortestToChar(S string, C byte) []int {

	l := len(S)
	dp := make([]int, l)
	for i := 0; i < len(S); i++ {
		dp[i] = 10000
	}
	dist := 10000
	for i := 0; i < len(S); i++ {
		if S[i] == C {
			dist = 0
		}
		dp[i] = min(dp[i], dist)
		dist++
	}
	for i := len(S) - 1; i >= 0; i-- {
		if S[i] == C {
			dist = 0
		}
		dp[i] = min(dp[i], dist)
		dist++
	}
	return dp
}

func min(i, j int) int {
	if i > j {
		return j
	}
	return i
}