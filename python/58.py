class Solution:
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        if s == "":
            return 0
        #delete the space at start or end
        s = s.strip()
        l = len(s)-1
        while l >= 0  and s[l] != " ":
            l -=1
        if l == -1:
            return len(s)

        return len(s) - l-1
