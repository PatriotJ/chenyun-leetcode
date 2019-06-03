func peakIndexInMountainArray(A []int) int {
	lo := 0
	hi := len(A) - 1
	for lo < hi {
		mid := (lo + hi) / 2
		if A[mid] < A[mid+1] {
			lo = mid + 1
		} else {
			hi = mid
		}
	}
	return lo
}