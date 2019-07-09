func mySqrt(x int) int {
	if x == 0 {
		return 0
	}
	if x <= 3 {
		return 1
	}
	lo := 1
	hi := x
	for lo < hi {
		mid := (lo + hi) / 2
		if mid*mid == x {
			return mid
		}
		if mid*mid < x {
			lo = mid + 1
		} else {
			hi = mid
		}
	}
	return lo - 1
}