func nthSuperUglyNumber(n int, primes []int) int {
	dp := make([]int, n)
	dp[0] = 1

	// sort.Ints(primes)
	l := len(primes)
	id := make([]int, l)
	fac := make([]int, l)
	for i, v := range primes {
		fac[i] = v
	}
	for i := 1; i < n; i++ {
		min := min(fac)
		dp[i] = min
		for j, v := range fac {
			if min == v {
				fac[j] = dp[id[j]+1] * primes[j]
				id[j] = id[j] + 1
			}
		}
	}

	return dp[n-1]
}

func min(nums []int) int {
	x := nums[0]
	for _, v := range nums {
		if v < x {
			x = v
		}
	}
	return x
}