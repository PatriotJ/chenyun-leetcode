func countPrimes(n int) int {
	prime := make([]bool, n)
	for i := 2; i < n; i++ {
		prime[i] = true
	}
	for i := 2; i*i < n; i++ {
		if prime[i] == false {
			continue
		} else {
			for j := i * i; j < n; j += i {
				prime[j] = false
			}
		}
	}
	count := 0
	for i := 2; i < n; i++ {
		if prime[i] {
			count++
		}
	}
	return count
}