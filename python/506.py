class Solution:
    def findRelativeRanks(self, nums):
        """
        :type nums: List[int]
        :rtype: List[str]
        """
        new_lst = sorted(nums)
        l = len(nums)
        d = {}
        ans = [""] * l
        for i in range(l):
            d[new_lst[i]] = l - i

        for j in range(l):
            if d[nums[j]] == 1:
                ans[j] = "Gold Medal"
            elif d[nums[j]] == 2:
                ans[j] = "Silver Medal"
            elif d[nums[j]] == 3:
                ans[j] = "Bronze Medal"
            else:
                ans[j] = str(d[nums[j]])
        return ans
