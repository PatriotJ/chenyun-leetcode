class Solution:
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        ans = []
        st = ""
        for i in digits:
            st += str(i)
        s = str(int(st)+1)

        for i in range(len(s)):
            ans.append(int(s[i]))
        return anss
