import "strings"

func repeatedStringMatch(A string, B string) int {
	S := ""

	for i := 1; i <= len(B)/len(A)+2; i++ {
		S = S + A
		if strings.Contains(S, B) {
			return i
		}
	}
	return -1
}