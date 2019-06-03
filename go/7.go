func reverse(x int) int {
	if x == 0 || x-int(int32(x)) > 0 {
		return 0
	}
	pos := x > 0
	if pos == false {
		x = -x
	}
	m := 0
	for x > 0 {
		z := x % 10
		m = m*10 + z
		x = x / 10
		if m != int(int32(m)) {
			return 0
		}
	}

	if pos {
		return m
	} else {
		return -m
	}
}