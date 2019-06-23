class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        pos = 1 if dividend * divisor >= 0 else -1;
        t1 = abs(dividend)
        t2 = abs(divisor)
        c = 1
        while t1 >= t2:
            t2 <<= 1
            c <<= 1
        
        res = 0
        while t1 >= abs(divisor):
            while t1 >= t2:
                t1 -= t2
                res += c
            
            t2 >>= 1
            c >>= 1
        
        if pos * res > 2147483647:
            return 2147483647
        
        return pos * res; 
      