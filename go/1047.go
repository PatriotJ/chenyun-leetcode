func removeDuplicates(S string) string {
	bs := []byte(S)
	stack, top := make([]byte, len(bs)), -1
	for i := 0; i < len(S); i++ {
		if top >= 0 && stack[top] == S[i] {
			top--
		} else {
			top++
			stack[top] = S[i]
		}
	}
	return string(stack[:top+1])
}