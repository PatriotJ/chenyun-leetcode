class Solution:
    def validPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        start = 0
        end = len(s) - 1
        flag = True
        def isValid(start,end,s,flag):
            while start < end:
                if s[start] == s[end]:
                    start += 1
                    end -= 1
                else:
                    if flag:
                        return isValid(start+1,end,s,False) or isValid(start,end-1,s,False)
                    else:
                        return False
            return True

        return isValid(start,end,s,flag)
