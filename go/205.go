func isIsomorphic(s string, t string) bool {
	if len(s) != len(t) {
		return false
	}
	src := make(map[byte]int)
	dst := make(map[byte]int)
	for i := 0; i < len(s); i++ {
		v1, ok1 := src[s[i]]
		v2, ok2 := dst[t[i]]
		if ok1 != ok2 {
			return false
		}
		if ok1 == false && ok2 == false {
			src[s[i]] = i + 1
			dst[t[i]] = i + 1
		} else {
			if v1 != v2 {
				return false
			} else {
				src[s[i]] = i + 1
				dst[t[i]] = i + 1
			}
		}
	}
	return true
}