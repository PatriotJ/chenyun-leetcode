func binaryGap(N int) int {
	left := -1
	ans := 0
	i := 0
	for N > 0 {
		k := N % 2
		N /= 2
		if k == 1 {
			if left == -1 {
				left = i
			} else {
				if i-left > ans {
					ans = i - left
				}
				left = i
			}
		}
		i++
	}
	return ans
}