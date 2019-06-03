func nthUglyNumber(n int) int {
	ugly := make([]int, n)
	ugly[0] = 1
	id2, id3, id5 := 0, 0, 0
	fac2, fac3, fac5 := 2, 3, 5
	v := 1
	for v < n {
		min := min(min(fac2, fac3), fac5)
		ugly[v] = min
		v++
		if min == fac2 {
			id2++
			fac2 = 2 * ugly[id2]
			// id2 ++
		}
		if min == fac3 {
			id3++
			fac3 = 3 * ugly[id3]
			// id3 ++
		}
		if min == fac5 {
			id5++
			fac5 = 5 * ugly[id5]
			// id5 ++
		}
	}
	// fmt.Println(ugly)
	return ugly[n-1]
}

func min(x, y int) int {
	if x < y {
		return x
	} else {
		return y
	}
}