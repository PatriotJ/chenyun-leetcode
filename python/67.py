class Solution:
    def addBinary(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """
        l1 = len(a)-1
        l2 = len(b)-1
        result = ""
        digit = 0
        while l1 >= 0 and l2 >= 0:
            x = (int(a[l1]) +int(b[l2]) +digit) % 2
            digit = (int(a[l1]) +int(b[l2]) +digit) // 2
            result = str(x) + result
            l1 -=1
            l2 -=1
        while l1 >= 0:
            x = (int(a[l1]) + digit) % 2
            digit = (int(a[l1])+digit) // 2
            result = str(x) + result
            l1 -= 1
        while l2 >= 0:
            x = (int(b[l2]) + digit) % 2
            digit = (int(b[l2])+digit) // 2
            result = str(x) + result
            l2 -= 1
        if digit == 1:
            return "1"+result
        return result
