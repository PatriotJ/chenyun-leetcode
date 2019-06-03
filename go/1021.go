func removeOuterParentheses(S string) string {
	var c string
	counter := 0
	for _, v := range S {

		if v == '(' {
			if counter == 0 {

			} else {
				c = c + string(v)
			}
			counter++
		} else if v == ')' {
			if counter == 1 {

			} else {
				c = c + string(v)
			}
			counter--
		}

	}
	return c
}