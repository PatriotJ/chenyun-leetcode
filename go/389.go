func findTheDifference(s string, t string) byte {
	sMap := make(map[byte]int)
	for i := 0; i < len(s); i++ {
		value, ok := sMap[s[i]]
		if ok {
			sMap[s[i]] = value + 1
		} else {
			sMap[s[i]] = 1
		}
	}
	for i := 0; i < len(t); i++ {
		value, ok := sMap[t[i]]
		if !ok {
			return t[i]
		} else {
			if value == 0 {
				return t[i]
			} else {
				sMap[t[i]] = value - 1
			}
		}
	}
	return 'a'
}