class Solution:
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """

        ans = 0
        l = len(nums)
        if l<=1:
            return l
        for i in range(1,l):
            if nums[i] != nums[ans]:
                ans +=1
                nums[ans] = nums[i]
        return ans+1
        
