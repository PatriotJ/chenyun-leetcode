func merge(nums1 []int, m int, nums2 []int, n int) {
	l := m + n - 1
	m = m - 1
	n = n - 1
	for m >= 0 && n >= 0 {
		if nums1[m] < nums2[n] {
			nums1[l] = nums2[n]
			n--
		} else {
			nums1[l] = nums1[m]
			m--
		}
		l--
	}
	for m >= 0 {
		nums1[l] = nums1[m]
		m--
		l--
	}
	for n >= 0 {
		nums1[l] = nums2[n]
		n--
		l--
	}
}