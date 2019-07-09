func addBinary(a string, b string) string {
	m, n := len(a)-1, len(b)-1
	ans := ""
	carry := 0
	for m >= 0 && n >= 0 {
		c, d := 0, 0
		if a[m] == '1' {
			c = 1
		}
		if b[n] == '1' {
			d = 1
		}
		y := carry + c + d
		carry = y / 2
		x := y % 2
		// fmt.Println(y)
		if x == 1 {
			ans = "1" + ans
		} else {
			ans = "0" + ans
		}
		m--
		n--
	}
	for m >= 0 {
		c := 0
		if a[m] == '1' {
			c = 1
		}
		y := carry + c
		carry = y / 2
		x := y % 2
		if x == 1 {
			ans = "1" + ans
		} else {
			ans = "0" + ans
		}
		m--
	}
	for n >= 0 {
		c := 0
		if b[n] == '1' {
			c = 1
		}
		y := carry + c
		carry = y / 2
		x := y % 2
		if x == 1 {
			ans = "1" + ans
		} else {
			ans = "0" + ans
		}
		n--
	}
	if carry == 1 {
		ans = "1" + ans
	}
	return ans

}