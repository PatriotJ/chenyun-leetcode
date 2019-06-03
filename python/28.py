class Solution:
    def strStr(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        if needle == "":
            return 0
        l1 = len(haystack)
        l2 = len(needle)
        if l1 == l2:
            if haystack == needle:
                return 0
            else:
                return -1
        j = 0

        for i in range(l1):
            k = i
            j = 0
            while j<l2 and k<l1 and haystack[k] == needle[j]:
                k += 1
                j += 1
            if j == l2:
                return i
        return -1 if needle else 0s
# class Solution:
#     def strStr(self, haystack, needle):
#         """
#         :type haystack: str
#         :type needle: str
#         :rtype: int
#         """
#         if needle in haystack:
#             return haystack.index(needle)
#         else:
#             return (-1)
