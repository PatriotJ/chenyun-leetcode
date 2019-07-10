import "math"

func checkPerfectNumber(num int) bool {
	if num < 4 {
		return false
	}
	sum := 0
	for i := 1; i <= int(math.Sqrt(float64(num))); i++ {
		if num%i == 0 {
			sum += i + num/i
		}
	}
	return sum == 2*num
}