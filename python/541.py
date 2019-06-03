class Solution:
    def reverseStr(self, s, k):
        """
        :type s: str
        :type k: int
        :rtype: str
        """
        l = len(s)
        start = 0
        ans = ""
        while l > 2 * k:
            temp = s[start:start + k]
            ans = ans + temp[::-1] + s[start+k:start +2 *k]
            start += 2 * k
            l -= 2*k
        if l < k:
            temp = s[start:]
            ans = ans + temp[::-1]
        else:
            temp = s[start:start + k]
            ans = ans + temp[::-1] + s[start+k:]
        return ans
