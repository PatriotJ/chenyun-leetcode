class Solution:
    def confusingNumber(self, N: int) -> bool:
        str = ''
        n = N
        if n == 0:
            return False
        while n != 0:
            k = n % 10
            if k == 0:
                str += '0'
            elif k == 1:
                str += '1'
            elif k == 6:
                str += '9'
            elif k == 8:
                str += '8'
            elif k == 9:
                str += '6'
            else:
                return False
            n = n // 10
        return int(str) != N