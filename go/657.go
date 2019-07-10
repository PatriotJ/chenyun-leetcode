func judgeCircle(moves string) bool {
	left, up := 0, 0
	for i := 0; i < len(moves); i++ {
		switch moves[i] {
		case 'U':
			up++
		case 'D':
			up--
		case 'L':
			left++
		case 'R':
			left--
		}
	}
	return left == 0 && up == 0
}