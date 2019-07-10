import "math"

func findComplement(num int) int {
	ans, i := 0, 0
	for num > 0 {
		k := 1 - (num & 1)
		ans += k * int(math.Pow(2, float64(i)))
		i++
		num >>= 1
	}
	return ans
}