import "sort"

func twoSumLessThanK(A []int, K int) int {
	sort.Ints(A)
	ans := -1
	lo, hi := 0, len(A)-1
	for lo < hi {
		sum := A[lo] + A[hi]
		if sum >= K {
			hi--
		} else {
			ans = max(ans, sum)
			lo++
		}
	}
	return ans
}

func max(i, j int) int {
	if i > j {
		return i
	}
	return j
}