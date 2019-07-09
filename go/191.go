func hammingWeight(num uint32) int {
	ans := 0
	for num != 0 {

		ans += int(num & 1)
		num /= 2
	}
	return ans
}