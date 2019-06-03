class Solution:
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """

        if x > 0 :
            s = str(x)
            ans = int(s[::-1])
            if ans > 2**31-1:
                return 0
            else:
                return ans
        if x == 0:
            return 0
        else:
            x = abs(x)
            s = str(x)
            ans = int(s[::-1])
            if ans > 2**31:
                return 0
            return -ans
