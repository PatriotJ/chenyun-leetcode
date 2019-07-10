const INT_MAX = int(^uint(0) >> 1)
const INT_MIN = ^INT_MAX

func thirdMax(nums []int) int {
	first, second, third := INT_MIN, INT_MIN, INT_MIN
	for _, v := range nums {
		if v > first {
			third = second
			second = first
			first = v
		} else if v < first && v > second {
			third = second
			second = v
		} else if v > third && v < second {
			third = v
		}
	}
	if third == INT_MIN {
		return first
	}
	return third
}