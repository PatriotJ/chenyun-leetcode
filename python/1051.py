class Solution:
    def heightChecker(self, heights: List[int]) -> int:
        stack = sorted(heights)
        ans = 0
        for i in range(len(stack)):
            if heights[i] != stack[i]:
                ans += 1
        return ans