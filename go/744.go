func nextGreatestLetter(letters []byte, target byte) byte {
	l := len(letters)
	if letters[l-1] <= target {
		return letters[0]
	}
	lo, hi := 0, l-1
	for lo < hi {
		mid := (lo + hi) / 2
		if letters[mid] > target {
			hi = mid
		} else {
			lo = mid + 1
		}
	}
	return letters[lo]
}