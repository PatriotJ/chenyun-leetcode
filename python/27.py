class Solution:
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        l = len(nums)
        if l == 0:
            return 0
        ans = 0
        for i in range(l):
            if nums[i] != val:
                nums[ans] = nums[i]
                ans += 1
        return ans
