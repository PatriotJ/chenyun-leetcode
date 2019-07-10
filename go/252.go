import "sort"

func canAttendMeetings(intervals [][]int) bool {
	ivs := MyIntervals(intervals)
	sort.Sort(ivs)
	for i := 0; i < len(ivs)-1; i++ {
		if ivs[i][1] > ivs[i+1][0] {
			return false
		}
	}
	return true
}

type MyIntervals [][]int

func (ivs MyIntervals) Len() int {
	return len(ivs)
}

func (ivs MyIntervals) Swap(i, j int) {
	ivs[i], ivs[j] = ivs[j], ivs[i]
}

func (ivs MyIntervals) Less(i, j int) bool {
	return ivs[i][0] < ivs[j][0]
}