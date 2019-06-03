class Solution:
    def checkPerfectNumber(self, num):
        """
        :type num: int
        :rtype: bool
        """
        if num <= 1:
            return False
        sums = 1
        factor = 2
        while factor <= int(num ** 0.5):
            if num % factor == 0:
                sums += factor
                sums += num//factor
            factor += 1
        return sums == num
