class Solution:
    def mySqrt(self, x):
        """
        :type x: int
        :rtype: int
        """
        if x == 0:
            return 0
        if x == 1:
            return 1
        lo = 0
        hi = x
        while lo <= hi:
            mid = (lo + hi)//2
            if mid * mid < x:
                lo = mid + 1
            if mid * mid > x:
                hi = mid - 1
            if mid * mid == x:
                return mid
        return hi
#牛顿迭代法
