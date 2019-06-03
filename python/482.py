class Solution:
    def licenseKeyFormatting(self, S, K):
        """
        :type S: str
        :type K: int
        :rtype: str
        """
        ans = []
        l = len(S) - 1
        while l >= 0:
            if S[l] != "-":
                if len(ans) % (K+1) == K:
                    ans.append("-")
                ans.append(S[l])
            l-=1
        ans_str = "".join(ans[::-1])
        return ans_str.upper()
