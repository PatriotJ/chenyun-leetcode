func reverseStr(s string, k int) string {
	sbyte := []byte(s)
	i := 0
	for ; i < len(s); i += 2 * k {
		j := i
		l := i + k - 1
		if l > len(s)-1 {
			l = len(s) - 1
		}
		swap(sbyte, j, l)
	}
	return string(sbyte)

}

func swap(sb []byte, i, j int) {
	for i < j {
		k := sb[i]
		sb[i] = sb[j]
		sb[j] = k
		i++
		j--
	}
}