class Solution:
    def climbStairs(self, n):
        """
        :type n: int
        :rtype: int
        """
        if n == 1:
            return 1
        if n == 2:
            return 2
        array = n*[0]
        array[0] = 1
        array[1] = 2
        for i in range(2,n):
            array[i] = array[i-1] +array[i-2]
        return array[n-1]
#python利用数组代替递归
