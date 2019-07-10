import "strings"

func rotateString(A string, B string) bool {
	if len(A) != len(B) {
		return false
	}
	S := A + A
	return strings.Contains(S, B)
}