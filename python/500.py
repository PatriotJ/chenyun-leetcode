class Solution:
    def findWords(self, words):
        """
        :type words: List[str]
        :rtype: List[str]
        """
        r1 = "qwertyuiop"
        r2 = "asdfghjkl"
        r3 = "zxcvbnm"

        ans = []
        d = {}
        for r in r1:
            d[r] = 1
        for r in r2:
            d[r] = 2
        for r in r3:
            d[r] = 3

        for word in words:
            temp = word.lower()
            pre = d[temp[0]]
            same = True
            for x in temp:
                if d[x] != pre:
                    same = False
                    break
            if same:
                ans.append(word)
        return ans
