class Solution:
    def findLengthOfLCIS(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """

        ans = 1
        temp = 1
        l = len(nums)
        if l == 0:
            return 0
        if l == 1:
            return 1
        for i in range(1,l):
            if nums[i] > nums[i - 1]:
                temp += 1
            else:
                ans = max(ans,temp)
                temp = 1
        ans = max(ans,temp)
        return ans
