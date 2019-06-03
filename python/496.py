class Solution:
    def nextGreaterElement(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        ans = [-1] * len(nums1)
        dic= {}
        for i,num in enumerate(nums1):
            dic[num] = i
        stack = []
        for num in nums2:
            while stack and stack[-1] < num:
                top = stack.pop()
                if top in dic:
                    ans[dic[top]] = num
            stack.append(num)
        return ans
