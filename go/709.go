func toLowerCase(str string) string {
	sbytes := []byte(str)
	for i, b := range sbytes {
		if b >= 'A' && b <= 'Z' {
			sbytes[i] = byte(b - 'A' + 'a')
		}
	}
	return string(sbytes)
}