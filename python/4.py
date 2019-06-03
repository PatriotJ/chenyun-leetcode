class Solution:
    def median(self,nums):
        l = len(nums)
        if l % 2 == 0:
            return (nums[l/2]+nums[l/2+1])/2
        else:
            return nums[(l-1)/2]
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        a, b = sorted((nums1, nums2), key=len)# len(a) is smaller
        m, n = len(a), len(b)
        after = (m + n - 1) // 2#median index
        lo, hi = 0, m
        while lo < hi:
            i = (lo + hi) // 2
            if after-i-1 < 0 or a[i] >= b[after-i-1]:
                hi = i
            else:
                lo = i + 1
        i = lo
        nextfew = sorted(a[i:i+2] + b[after-i:after-i+2])
        return (nextfew[0] + nextfew[1 - (m+n)%2]) / 2.0s
