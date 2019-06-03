class Solution:
    def findLUSlength(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: int
        """
        l1 = len(a)
        l2 = len(b)

        if l1 != l2:
            return max(l1,l2)
        else:
            return -1 if a == b else l1
