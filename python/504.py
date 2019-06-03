class Solution:
    def convertToBase7(self, num):
        """
        :type num: int
        :rtype: str
        """
        if num == 0:
            return "0"
        ans = ""

        temp = abs(num)
        while temp > 0:
            index = temp % 7
            ans = str(index) + ans
            temp = temp // 7
        if num > 0:
            return ans
        return "-"+ans
