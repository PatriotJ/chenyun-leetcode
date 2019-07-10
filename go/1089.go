func duplicateZeros(arr []int) {
	arr2 := make([]int, len(arr))
	copy(arr2, arr)
	i, j := 0, 0
	for i < len(arr) {
		arr[i] = arr2[j]
		i++
		if arr2[j] == 0 && i < len(arr) {
			arr[i] = arr2[j]
			i++
		}
		j++
	}

}