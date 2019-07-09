func maxProfit(prices []int) int {
	min := int(^uint(0) >> 1)
	prof := 0
	for i := 0; i < len(prices); i++ {
		if prices[i] < min {
			min = prices[i]
		} else if prices[i]-min > prof {
			prof = prices[i] - min
		}
	}
	return prof

}