import "strings"

func lengthOfLastWord(s string) int {
	s = strings.TrimSpace(s)
	S := strings.Split(s, " ")
	if len(S) == 0 {
		return 0
	}
	return len(S[len(S)-1])
}