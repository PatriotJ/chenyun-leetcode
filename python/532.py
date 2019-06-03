class Solution:
    def findPairs(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        if k < 0:
            return 0
        ans = 0
        d = {}
        nums.sort()
        for i in nums:
            d[i] = d.get(i,0) + 1

        for i in d :
            if k != 0:
                if (i+k) in d:
                    ans += 1
            else:
                if d[i] > 1:
                    ans += 1
        return ans
