class Solution:
    def findMaxConsecutiveOnes(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        length = 0
        temp = 0
        for i in nums:
            if i == 1:
                temp += 1
            else:
                if temp > length :
                    length =  temp
                temp = 0
        if temp > length :
            length =  temp
        return length
