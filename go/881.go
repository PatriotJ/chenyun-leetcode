import "sort"

func numRescueBoats(people []int, limit int) int {
	n := len(people)
	sort.Ints(people)
	i, j := 0, n-1
	boats := 0
	for i < n && j >= 0 && i <= j {
		if people[i]+people[j] <= limit {
			i++
		}
		j--
		boats++
	}
	return boats
}