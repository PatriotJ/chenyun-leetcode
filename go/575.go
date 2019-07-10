func distributeCandies(candies []int) int {
	ret := len(candies) / 2
	candy := make(map[int]int)
	for _, c := range candies {
		candy[c] = candy[c] + 1
	}
	if len(candy) < ret {
		return len(candy)
	}
	return ret
}