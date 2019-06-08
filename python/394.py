class Solution:
    def decodeString(self, s: str) -> str:
        def helper(s):
            j = 0
            while(j < len(s) and s[j].isalpha()):
                j += 1
            return s[:j],int(s[j:])
            
        cur = ''
        stack = []
        for i in s:
            if i == '[':
                stack.append(cur)
                cur = ''
            elif i == ']':
                last = stack.pop()
                lastChar,lastNum = helper(last)
                # print(lastChar,lastNum)
                cur = lastChar + lastNum*cur
                # print(cur)
            else:
                cur += i
        return cur
class Solution:
    def decodeString(self, s: str) -> str:
        stack = []
        num = []
        j = 0
        cur = ''
        for ch in s:
            if ch == '[':
                num.append(j)
                j = 0
                stack.append(cur)
                cur = ''
            elif ch == ']':
                S = stack.pop()
                q = num.pop()
                cur = S + cur * q
            elif ch.isnumeric():
                j = int(ch) + 10 * j
            else:
                cur += ch
        return cur
